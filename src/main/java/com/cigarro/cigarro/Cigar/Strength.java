package com.cigarro.cigarro.Cigar;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Strength {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    @Column(name = "name")
    private String strength;

    public Strength() {
    }

    public Strength(Long id, String strength) {
        this.id = id;
        this.strength = strength;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Strength{" +
                "id=" + id +
                ", strength='" + strength + '\'' +
                '}';
    }
}
