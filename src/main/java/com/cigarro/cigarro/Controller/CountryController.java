package com.cigarro.cigarro.Controller;

import com.cigarro.cigarro.Cigar.Country;
import com.cigarro.cigarro.Repo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class CountryController {
//
//    @Autowired
//    private CountryRepo countryRepo;
//
//    public CountryController(CountryRepo countryRepo) {
//        this.countryRepo = countryRepo;
//    }
//
//    @GetMapping("/countries")
//    public Iterable<Country> getCountry(){
//        return countryRepo.findAll();
//    }
//
//    @GetMapping("/countries/{id}")
//    public Country getCigarCountry(@PathVariable Long id){
//        return countryRepo.findById(id).orElseThrow(RuntimeException::new);
//    }

}
