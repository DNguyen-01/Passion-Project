package com.cigarro.cigarro.Cigar;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


/*TODO
Cigar requires an inner join w/ the brand, strength, and country table - on its wn it has no value
- research ways to query from multiple tables for the cigar class (JPA perspective)
- come up w/ a wire mock for the front-end  - basic front end UI - search function, free floating text
- filtering/search methods in the cigar controller class
- UML
**THINK** -- (MYSQL) ACID properties - Atomic(defining something once), Consistency (data is always consistent), Isolation (ordering/ability to run certain query in any order), Durability (backups)
- JPA Buddy is acting up...whats happening?
*/


@Entity
public class Cigar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    @Column(name = "manufacturer")
    private String brand;

    @Column(name = "brand")
    private String name;

    @Column(name ="strength")
    private String strength;

    @Column(name = "country")
    private String country;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_name")
    private Set<Brand> brandsList;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Set<Country> countryList;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Set<Strength> strengthList;


    public Cigar() {
    }

    public Set<Brand> getBrandsList() {
        return brandsList;
    }

    public Set<Country> getCountryList() {
        return countryList;
    }

    public Set<Strength> getStrengthList() {
        return strengthList;
    }

    public Cigar(Long id, String brand, String name, String strength, String country) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.strength = strength;
        this.country = country;
    }

    public Cigar(String brand, String name, String strength, String country) {
        this.brand = brand;
        this.name = name;
        this.strength = strength;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Cigar{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", strength='" + strength + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public void addAttribute(String listCigar, List<Cigar> listCigar1) {
    }
}
