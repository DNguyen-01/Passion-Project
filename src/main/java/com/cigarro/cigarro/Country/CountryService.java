package com.cigarro.cigarro.Country;

import com.cigarro.cigarro.Brand.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepo countryRepository;

    public Country getCountryById(Long id){
        return countryRepository.findCountryById(id);
    }

    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    public Country create(Country brand){
        return countryRepository.save(brand);
    }

    public Country update(Long id, Country country){
        Country countryInDataBase = countryRepository.findById(id).get();
        String newCountry = country.getName();
        countryInDataBase.setName(newCountry);
        countryInDataBase = countryRepository.save(countryInDataBase);
        return countryRepository.save(countryInDataBase);
    }

    public Country delete(Long id){
        Country countryToBeDeleted = countryRepository.findCountryById(id);
        countryRepository.deleteById(id);
        return countryToBeDeleted;

    }


}
