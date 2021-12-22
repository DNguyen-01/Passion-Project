import re
import requests

BASE_URL="https://www.cigaraficionado.com/ratings/"
# headers needed to pretend to be browser
HEADERS = {'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36'} # This is chrome, you can set whatever browser you like

BRANDS_ID_MAP = {}
COUNTRIES_ID_MAP = {}
STRENGTH_ID_MAP = {}

def parse_url():
    NEXT_BRAND_ID = 1
    NEXT_COUNTRY_ID = 1
    NEXT_STRENGTH_ID = 1
    NEXT_CIGAR_ID = 1
    f = open("output2.sql", "w")
#     for i in range(18550, 18560):
    for i in range(18550, 23000):
        if i % 500 == 0:
            print("processing ID: " + str(i))

        r = requests.get(BASE_URL + str(i), headers=HEADERS)
        if r.status_code == 200:
            try:
                text_body_lines = r.text.split("\n")
                brand = text_body_lines[18].split("content=\"")[1].split(" |")[0]
                raw_name = text_body_lines[324].split("<h1>")[1].split("</h1>")[0][len(brand)+1:]
                strength = text_body_lines[362].split("<strong>")[1].split("</strong>")[0]
                country = re.split(" +", text_body_lines[399])[1]

                ## retrieve brand
                if brand in BRANDS_ID_MAP:
                    brand_id = BRANDS_ID_MAP[brand]
                else:
                    brand_id = NEXT_BRAND_ID
                    BRANDS_ID_MAP[brand] = NEXT_BRAND_ID
                    NEXT_BRAND_ID += 1
                    output(f, "INSERT INTO BRAND(id,name) VALUES(" + str(brand_id) + ",'" + brand + "');")

                ## retrieve strength
                if strength in STRENGTH_ID_MAP:
                    strength_id = STRENGTH_ID_MAP[strength]
                else:
                    strength_id = NEXT_STRENGTH_ID
                    STRENGTH_ID_MAP[strength] = NEXT_STRENGTH_ID
                    NEXT_STRENGTH_ID += 1
                    output(f, "INSERT INTO STRENGTH(id,name) VALUES(" + str(strength_id) + ",'" + strength + "');")

                ## retrieve country
                if country in COUNTRIES_ID_MAP:
                    country_id = COUNTRIES_ID_MAP[country]
                else:
                    country_id = NEXT_COUNTRY_ID
                    COUNTRIES_ID_MAP[country] = NEXT_COUNTRY_ID
                    NEXT_COUNTRY_ID += 1
                    output(f, "INSERT INTO COUNTRY(id,name) VALUES(" + str(country_id) + ",'" + country + "');")

                output(f, "INSERT INTO CIGAR(id,name,brand_id,country_id,strength_id) VALUES(" +
                    str(NEXT_CIGAR_ID) + ",'" +
                    raw_name + "'," +
                    str(brand_id) + "," +
                    str(country_id) + "," +
                    str(strength_id) + ");")
                NEXT_CIGAR_ID += 1

            except Exception as e:
                print("Something bad happened: " + str(e))
        else:
            print("Unexpected status code: " + str(r.status_code))
    print("Done parsing...")
    f.close()

def output(f, str):
#     print(str)
    f.write(str + "\n")

if __name__ == "__main__":
    parse_url()
