package com.cigarro.cigarro.Brand;

import com.cigarro.cigarro.Country.Country;
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

    public Iterable<Brand> findAll() {
        return brandRepository.findAll();
    }

    public Brand create(Brand brand){
        return brandRepository.save(brand);
    }

    public Brand update(Long id, Brand brand){
        Brand brandInDatabase = brandRepository.findById(id).get();
        String newBrand = brand.getName();
        brandInDatabase.setName(newBrand);
        brandInDatabase = brandRepository.save(brandInDatabase);
        return brandRepository.save(brandInDatabase);
    }

    public Brand delete(Long id){
        Brand brandToBeDeleted = brandRepository.findBrandById(id);
        brandRepository.deleteById(id);
        return brandToBeDeleted;

    }



}
