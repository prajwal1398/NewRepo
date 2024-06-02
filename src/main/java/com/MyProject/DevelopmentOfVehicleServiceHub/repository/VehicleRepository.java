package com.MyProject.DevelopmentOfVehicleServiceHub.repository;

import com.MyProject.DevelopmentOfVehicleServiceHub.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VehicleRepository   extends JpaRepository<Vehicle, Long> {
}


