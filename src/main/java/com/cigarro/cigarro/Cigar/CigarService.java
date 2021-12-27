package com.cigarro.cigarro.Cigar;

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
        cigarRepository.findCigarById(id).getId();
        return cigarRepository.save(cigar);
    }



}
