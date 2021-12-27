package com.cigarro.cigarro.Country;

import com.cigarro.cigarro.Brand.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepo countryRepository;

    public Optional<Country> getCountryById(Long id){
        return countryRepository.findById(id);
    }

    public Country create(Country brand){
        return countryRepository.save(brand);
    }

    public Country update(Long id, Country country){
        countryRepository.findById(id);
        return countryRepository.save(country);
    }

    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }


}
