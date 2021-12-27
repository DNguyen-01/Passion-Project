package com.cigarro.cigarro.Service;

import com.cigarro.cigarro.Cigar.Cigar;
import com.cigarro.cigarro.Repo.CigarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CigarService {
//
    @Autowired
    private CigarRepo cigarRepository;


    public Cigar getCigarById(Long id){

        return cigarRepository.findCigarById(id);

    }

    public Iterable<Cigar> findAll() {

        return cigarRepository.findAll();
    }

//
//    public Cigar create(Cigar cigar){
//        return cigarRepository.save(cigar);
//    }
//
//    public Brand readById(Long id){
//        return cigarRepository.findById(id).get();
//    }
//
//    public List<Cigar> readAll() {
//        Iterable<Brand> allCigar = cigarRepository.findAll();
//        List<Cigar> cigarList = new ArrayList<>();
//        allCigar.forEach(cigarList::add);
//        return cigarList;
//    }

//    public Cigar update(Long id, Cigar newCigarData){
//        Cigar personInDatabase = this.readById(id);
//        personInDatabase.setFirstName(newPersonData.getFirstName());
//        personInDatabase.setLastName(newPersonData.getLastName());
//        personInDatabase = cigarRepository.save(personInDatabase);
//        return personInDatabase;
//    }

//    public Person deleteById(Long id) {
//        Person personToBeDeleted = this.readById(id);
//        repository.delete(personToBeDeleted);
//        return personToBeDeleted;
//    }





}
