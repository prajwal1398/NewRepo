package com.MyProject.DevelopmentOfVehicleServiceHub.repository;


import com.MyProject.DevelopmentOfVehicleServiceHub.model.Service;
import com.MyProject.DevelopmentOfVehicleServiceHub.model.ServiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findByServiceStatus(ServiceStatus serviceStatus);
    List<Service> findByTechnicianName(String technicianName);
    List<Service> findByEquipmentName(String equipmentName);

}