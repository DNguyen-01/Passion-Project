package com.cigarro.cigarro.Service;

//@Service
//public class CigarService {
//
//    private BrandRepo cigarRepository;
//
//    @Autowired
//    public CigarService(BrandRepo cigarRepository) {
//        this.cigarRepository = cigarRepository;
//    }
//
//    public Cigar create(Cigar cigar){
//        return cigarRepository.save(cigar);
//    }
//
//    public Brand readById(Long id){
//        return cigarRepository.findById(id).get();
//    }
//
//    public List<Cigar> readAll() {
//        Iterable<Brand> allCigar = cigarRepository.findAll();
//        List<Cigar> cigarList = new ArrayList<>();
//        allCigar.forEach(cigarList::add);
//        return cigarList;
//    }

//    public Cigar update(Long id, Cigar newCigarData){
//        Cigar personInDatabase = this.readById(id);
//        personInDatabase.setFirstName(newPersonData.getFirstName());
//        personInDatabase.setLastName(newPersonData.getLastName());
//        personInDatabase = cigarRepository.save(personInDatabase);
//        return personInDatabase;
//    }

//    public Person deleteById(Long id) {
//        Person personToBeDeleted = this.readById(id);
//        repository.delete(personToBeDeleted);
//        return personToBeDeleted;
//    }





//}
