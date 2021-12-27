package com.cigarro.cigarro.Brand;

import com.cigarro.cigarro.Brand.Brand;
import com.cigarro.cigarro.Brand.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand-controller")
public class BrandController {

    @Autowired
    private BrandService brandService;


    @GetMapping("/brands")
    public Iterable<Brand> getBrand(){
        return brandService.findAll();
    }

    @GetMapping("/brands/{id}")
    public Brand getCigarBrand(@PathVariable Long id){
        return brandService.getBrandById(id).orElseThrow(RuntimeException::new);
    }

    @GetMapping("/create")
    public Brand create(Brand name){
        return brandService.create(name);
    }


}
