package com.example.phamacy_management_system.repository;

import com.example.phamacy_management_system.model.Medicine;
import org.springframework.data.domain.Sort;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
    @Query("SELECT m FROM Medicine m WHERE "+
    "m.name LIKE CONCAT('%',:query,'%')"+" Or m.brand LIKE CONCAT('%',:query,'%')")
    List<Medicine> searchMedicine(String query);
}
