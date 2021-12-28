package com.cigarro.cigarro.Cigar;

import com.cigarro.cigarro.Cigar.Cigar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CigarRepo extends CrudRepository<Cigar, Long> {

//    @Query(value = "SELECT brand.name AS manufacturer, cigar.name AS BRAND, country.name AS country, strength.name AS strength FROM Cigar " +
//            "INNER JOIN Brand ON brand.id=cigar.brand_id INNER JOIN country ON " +
//            "cigar.country_id=country.id INNER JOIN strength ON cigar.strength_id=strength.id",
//            nativeQuery = true)
//    Optional<Cigar> findById(Long id);

    // TODO : what is going on with this query - getting Status 505 - Column manufacturer not found
    // TODO : column ID not found - with query active


    Cigar findCigarById(Long id);

    //this is writing the query - tables has been created by the JPA
    List<Cigar> findCigarByBrandId(Long id);
    List<Cigar> findCigarByStrengthName(String name);
    List<Cigar> findCigarByCountryName(String name);
    List<Cigar> findCigarByBrandNameAndStrengthName(String brandName, String strengthName);
    List<Cigar> findCigarByBrandNameAndCountryName(String brandName, String countryName);
    List<Cigar> findCigarByBrandNameAndCountryNameAndStrengthName(String brandName, String countryName, String strengthName);

}
