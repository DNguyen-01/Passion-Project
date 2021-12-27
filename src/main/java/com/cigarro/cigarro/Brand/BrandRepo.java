package com.cigarro.cigarro.Brand;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepo extends CrudRepository<Brand, Long> {

}
