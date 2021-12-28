package com.cigarro.cigarro.Strength;

import com.cigarro.cigarro.Brand.Brand;
import com.cigarro.cigarro.Country.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StrengthService {

    @Autowired
    private StrengthRepo strengthRepository;

    public Optional<Strength> getStrengthById(Long id){
        return strengthRepository.findById(id);
    }

    public Iterable<Strength> findAll() {
        return strengthRepository.findAll();
    }

    public Strength create(Strength strength){
        return strengthRepository.save(strength);
    }

    public Strength update(Long id, Strength strength){
        Strength strengthInDataBase =  strengthRepository.findById(id).get();
        String newStrength = strength.getName();
        strengthInDataBase.setName(newStrength);
        strengthInDataBase = strengthRepository.save(strengthInDataBase);
        return strengthRepository.save(strengthInDataBase);
    }

    public Strength delete(Long id){
        Strength strengthToBeDeleted = strengthRepository.findById(id).get();
        strengthRepository.deleteById(id);
        return strengthToBeDeleted;

    }

    public Optional<Strength> findById(Long id) {
        return strengthRepository.findById(id);
    }
}
