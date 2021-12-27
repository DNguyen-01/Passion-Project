package com.cigarro.cigarro.Country;

import com.cigarro.cigarro.Brand.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country-controller")
public class CountryController {

    @Autowired
    private CountryService countryService;


    @GetMapping("/countries")
    public Iterable<Country> getCountry(){
        return countryService.findAll();
    }

    @GetMapping("/countries/{id}")
    public Country getCigarCountry(@PathVariable Long id){
        return countryService.getCountryById(id).orElseThrow(RuntimeException::new);
    }

    @GetMapping("/create")
    public Country create(Country name){
        return countryService.create(name);
    }



}
