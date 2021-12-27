package com.cigarro.cigarro.Strength;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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




}
