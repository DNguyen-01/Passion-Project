package com.cigarro.cigarro.Country;

import com.cigarro.cigarro.Brand.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return countryService.getCountryById(id);
    }

    @PostMapping("/countries")
    public Country create(@RequestBody Country name){
        return countryService.create(name);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Country update(@PathVariable Long id, @RequestBody Country country){
        return countryService.update(id, country);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Country delete(@PathVariable Long id){
        return countryService.delete(id);
    }


}
