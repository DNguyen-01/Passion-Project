package com.cigarro.cigarro.Repo;

import com.cigarro.cigarro.Cigar.Strength;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrengthRepo extends CrudRepository<Strength, Long> {
}
