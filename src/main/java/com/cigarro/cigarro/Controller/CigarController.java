package com.cigarro.cigarro.Controller;

import com.cigarro.cigarro.Cigar.Cigar;
import com.cigarro.cigarro.Repo.CigarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class CigarController {

    @Autowired
    private final CigarRepo cigarRepo;



    public CigarController(CigarRepo cigarRepo) {
        this.cigarRepo = cigarRepo;
    }


    @GetMapping("/cigar")
    public Iterable<Cigar> getAllCigar(){
        return cigarRepo.findAll();
    }


    @GetMapping("/cigar/{id}")
    public Cigar getAllCigar(@PathVariable Long id){
        return cigarRepo.findById(id).orElseThrow(RuntimeException::new);
    }










//    private CigarService cigarService;
//
//    @Autowired
//    public CigarController(CigarService cigarService) {
//        this.cigarService = cigarService;
//    }
//
//    @Autowired
//    private BrandRepo cigarRepository;
//
//
//    @RequestMapping(method = RequestMethod.POST, value = "/create/{id}")
//    public ResponseEntity<Cigar> create(@RequestBody Cigar cigar) {
//        Cigar cigarInDatabase = cigarRepository.save(cigar);
//        ResponseEntity<Cigar> responseEntity = new ResponseEntity<>(cigarInDatabase, HttpStatus.CREATED);
//        return responseEntity;
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value ="/all")
//    public @ResponseBody Iterable<Cigar> getAllUsers() {
//        // This returns a JSON or XML with the users
//        return cigarRepository.findAll();
//    }

//    @RequestMapping(method = RequestMethod.GET, value = "/brand")
//    public ResponseEntity<List<Cigar>> read() {
//        Iterable<Cigar> iterable = cigarRepository.findAll();
//        List<Cigar> cigarList = new ArrayList<>();
//        for (Cigar cigar : iterable) {
//            cigarList.add(cigar);
//        }
//        return new ResponseEntity<>(cigarList, HttpStatus.OK);
//    }
}


