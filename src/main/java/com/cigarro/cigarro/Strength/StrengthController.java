package com.cigarro.cigarro.Strength;


import com.cigarro.cigarro.Country.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/strength-controller")
public class StrengthController {

    @Autowired
    private StrengthService strengthService;


    @GetMapping("/strength")
    public Iterable<Strength> getStrength(){
        return strengthService.findAll();
    }


    @GetMapping("/strength/{id}")
    public Strength getCigarStrength(@PathVariable Long id){
        return strengthService.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping("/strength")
    public Strength create(@RequestBody Strength name){
        return strengthService.create(name);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Strength update(@PathVariable Long id, @RequestBody Strength strength){
        return strengthService.update(id, strength);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Strength delete(@PathVariable Long id){
        return strengthService.delete(id);
    }


}
