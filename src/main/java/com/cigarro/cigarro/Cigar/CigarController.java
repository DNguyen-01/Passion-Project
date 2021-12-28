package com.cigarro.cigarro.Cigar;

import com.cigarro.cigarro.Cigar.Cigar;
import com.cigarro.cigarro.Cigar.CigarService;
import com.cigarro.cigarro.Strength.Strength;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cigar-controller") // controller should be calling service
public class CigarController {

    @Autowired
    private CigarService cigarService;


    @GetMapping("/cigar")
    public Iterable<Cigar> getAllCigar() {
        return cigarService.findAll();
    }

    @RequestMapping(value = "/cigar/{id}", method = RequestMethod.GET)
    public Cigar getCigarById(@PathVariable Long id) {
        return cigarService.getCigarById(id);
    }

    @PostMapping(value = "/cigar")
    public Cigar create(@RequestBody Cigar name) {
        return cigarService.create(name);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Cigar update(@PathVariable Long id, @RequestBody Cigar cigar) {
        return cigarService.update(id, cigar);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Cigar delete(@PathVariable Long id){
        return cigarService.delete(id);
    }

    @GetMapping("/test")
    public Iterable<Cigar> searchCigars(){
        return cigarService.search();
    }

}








