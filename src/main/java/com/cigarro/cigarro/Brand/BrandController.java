package com.cigarro.cigarro.Brand;

import com.cigarro.cigarro.Brand.Brand;
import com.cigarro.cigarro.Brand.BrandService;
import com.cigarro.cigarro.Country.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create")
    public Brand create(@RequestBody Brand name){
        return brandService.create(name);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Brand update(@PathVariable Long id, @RequestBody Brand brand){
        return brandService.update(id, brand);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Brand delete(@PathVariable Long id){
        return brandService.delete(id);
    }


}
