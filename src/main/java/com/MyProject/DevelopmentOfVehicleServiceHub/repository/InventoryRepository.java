package com.MyProject.DevelopmentOfVehicleServiceHub.repository;

import com.MyProject.DevelopmentOfVehicleServiceHub.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>  {
    Inventory findByPartNumber(String partNumber);

    void deleteByPartNumber(String partNumber);

    List<Inventory> findByQuantityLessThanEqual(int i);

    List<Inventory> findByQuantityGreaterThan(int i);

}

