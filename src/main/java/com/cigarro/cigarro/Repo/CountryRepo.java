package com.cigarro.cigarro.Repo;


import com.cigarro.cigarro.Cigar.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends CrudRepository<Country, Long> {

}
