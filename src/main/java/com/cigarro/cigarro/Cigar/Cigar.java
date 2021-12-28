package com.cigarro.cigarro.Cigar;

import com.cigarro.cigarro.Brand.Brand;
import com.cigarro.cigarro.Country.Country;
import com.cigarro.cigarro.Strength.Strength;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


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
    private Long id;

    private String name;
    @ManyToOne
    private Brand brand;
    @ManyToOne
    private Strength strength;
    @ManyToOne
    private Country country;


    public Cigar() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Strength getStrength() {
        return strength;
    }

    public void setStrength(Strength strength) {
        this.strength = strength;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Cigar{" +
                "id=" + id +
                ", brand=" + brand +
                ", name='" + name + '\'' +
                ", strength=" + strength +
                ", country=" + country +
                '}';
    }
}


