package com.cigarro.cigarro.Country;


import com.cigarro.cigarro.Country.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends CrudRepository<Country, Long> {

}
