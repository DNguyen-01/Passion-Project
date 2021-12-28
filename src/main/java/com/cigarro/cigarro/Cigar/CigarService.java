package com.cigarro.cigarro.Cigar;

import com.cigarro.cigarro.Brand.Brand;
import com.cigarro.cigarro.Country.Country;
import com.cigarro.cigarro.Strength.Strength;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CigarService {

    @Autowired
    private CigarRepo cigarRepository;


    public Cigar getCigarById(Long id){
        return cigarRepository.findCigarById(id);

    }

    public Iterable<Cigar> findAll() {
        return cigarRepository.findAll();
    }

    public Cigar create(Cigar cigar){
        return cigarRepository.save(cigar);
    }

    public Cigar update(Long id, Cigar cigar) {
        Cigar cigarInDatabase = cigarRepository.findCigarById(id);
        String newCigar = cigar.getName();
        Brand newBrand = cigar.getBrand();
        Country newCountry = cigar.getCountry();
        Strength newStrength = cigar.getStrength();
        cigarInDatabase.setName(newCigar);
        cigarInDatabase.setBrand(newBrand);
        cigarInDatabase.setCountry(newCountry);
        cigarInDatabase.setStrength(newStrength);
        return cigarRepository.save(cigarInDatabase);
    }

    public Cigar delete(Long id){
        Cigar cigarToBeDeleted = cigarRepository.findById(id).get();
        cigarRepository.deleteById(id);
        return cigarToBeDeleted;

    }
}
