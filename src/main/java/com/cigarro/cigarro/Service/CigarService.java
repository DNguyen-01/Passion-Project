package com.cigarro.cigarro.Service;

import com.cigarro.cigarro.Cigar.Cigar;
import com.cigarro.cigarro.Repo.CigarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        cigarRepository.findCigarById(id).getId();
        return cigarRepository.save(cigar);
    }



}
