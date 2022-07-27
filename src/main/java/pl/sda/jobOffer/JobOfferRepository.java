package pl.sda.jobOffer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface JobOfferRepository extends JpaRepository<JobOfferEntity, Long> {

//    List<JobOfferEntity> findByLocation(String location);
    List<JobOfferEntity> findByMinSalaryGreaterThanEqualAndMaxSalaryLessThanEqual(Double minSalary, Double maxSalary);
}
