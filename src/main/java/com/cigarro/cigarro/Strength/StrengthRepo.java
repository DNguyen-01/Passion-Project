package com.cigarro.cigarro.Strength;

import com.cigarro.cigarro.Strength.Strength;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrengthRepo extends CrudRepository<Strength, Long> {
}
