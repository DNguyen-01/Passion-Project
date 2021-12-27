package com.cigarro.cigarro.Brand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BrandService {

    @Autowired
    private BrandRepo brandRepository;

    public Optional<Brand> getBrandById(Long id){
        return brandRepository.findById(id);
    }

    public Brand create(Brand brand){
        return brandRepository.save(brand);
    }

    public Brand update(Long id, Brand brand){
        brandRepository.findById(id);
        return brandRepository.save(brand);
    }

    public Iterable<Brand> findAll() {
        return brandRepository.findAll();
    }

}
