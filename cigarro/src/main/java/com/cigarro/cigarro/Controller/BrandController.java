package com.cigarro.cigarro.Controller;

import com.cigarro.cigarro.Cigar.Brand;
import com.cigarro.cigarro.Repo.BrandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BrandController {

    @Autowired
    private BrandRepo cigarRepo;

    public BrandController(BrandRepo cigarRepo) {
        this.cigarRepo = cigarRepo;
    }

    @GetMapping("/brands")
    public Iterable<Brand> getBrand(){
        return cigarRepo.findAll();
    }

    @GetMapping("/{id}")
    public Brand getCigarBrand(@PathVariable Long id){
        return cigarRepo.findById(id).orElseThrow(RuntimeException::new);
    }


}
