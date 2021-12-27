package com.cigarro.cigarro.Strength;

import com.cigarro.cigarro.Brand.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StrengthService {

    @Autowired
    private StrengthRepo strengthRepository;

    public Optional<Strength> getBrandById(Long id){
        return strengthRepository.findById(id);
    }

    public Strength create(Strength strength){
        return strengthRepository.save(strength);
    }

    public Strength update(Long id, Strength strength){
        strengthRepository.findById(id);
        return strengthRepository.save(strength);
    }

    public Iterable<Strength> findAll() {
        return strengthRepository.findAll();
    }

    public Optional<Strength> findById(Long id) {
        return strengthRepository.findById(id);
    }
}
