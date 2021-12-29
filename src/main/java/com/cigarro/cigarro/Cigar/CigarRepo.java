package com.cigarro.cigarro.Cigar;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    List<Cigar> findCigarByBrandId(long id);
    List<Cigar> findCigarByStrengthId(long id);
    List<Cigar> findCigarByCountryId(long countryId);
    List<Cigar> findCigarByBrandIdAndStrengthId(long brandId, long strengthId);
    List<Cigar> findCigarByBrandIdAndCountryId(long brandId, long countryId);
    List<Cigar> findCigarByBrandIdAndCountryIdAndStrengthId(long brandId,
                                                                  long countryId,
                                                                  long strengthId);
    List<Cigar> findCigarByCountryIdAndStrengthId(long countryId, long strengthId);
//    Iterable<Cigar> findCigarByCountryId(long id);
}
