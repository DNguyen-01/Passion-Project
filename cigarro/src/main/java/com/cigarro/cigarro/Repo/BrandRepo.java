package com.cigarro.cigarro.Repo;

import com.cigarro.cigarro.Cigar.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepo extends CrudRepository<Brand, Long> {

}
