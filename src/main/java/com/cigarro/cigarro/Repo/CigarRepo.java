package com.cigarro.cigarro.Repo;

import com.cigarro.cigarro.Cigar.Cigar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CigarRepo extends JpaRepository<Cigar, Long> {

//    @Query(value = "SELECT brand.name AS manufacturer, cigar.name AS BRAND, country.name AS country, strength.name AS strength FROM Cigar " +
//            "INNER JOIN Brand ON brand.id=cigar.brand_id INNER JOIN country ON " +
//            "cigar.country_id=country.id INNER JOIN strength ON cigar.strength_id=strength.id",
//            nativeQuery = true)
//    Optional<Cigar> findById(Long id);

    // TODO : what is going on with this query - getting Status 505 - Column manufacturer not found
    // TODO : column ID not found - with query active


}
