package com.cigarro.cigarro.Controller;


import com.cigarro.cigarro.Cigar.Brand;
import com.cigarro.cigarro.Cigar.Strength;
import com.cigarro.cigarro.Repo.BrandRepo;
import com.cigarro.cigarro.Repo.StrengthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StrengthController {

    @Autowired
    private StrengthRepo strengthRepo;

    public StrengthController(StrengthRepo strengthRepo) {
        this.strengthRepo = strengthRepo;
    }

    @GetMapping("/strength")
    public Iterable<Strength> getStrength(){
        return strengthRepo.findAll();
    }

    @GetMapping("/strength/{id}")
    public Strength getCigarStrength(@PathVariable Long id){
        return strengthRepo.findById(id).orElseThrow(RuntimeException::new);
    }


    }
