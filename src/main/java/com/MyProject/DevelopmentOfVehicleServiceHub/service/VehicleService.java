package com.MyProject.DevelopmentOfVehicleServiceHub.service;

import com.MyProject.DevelopmentOfVehicleServiceHub.model.Vehicle;
import com.MyProject.DevelopmentOfVehicleServiceHub.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Optional<Vehicle> getVehicleById(Long id) {
        return vehicleRepository.findById(id);
    }

    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle updateVehicle(Long id, Vehicle vehicleDetails) {
        Vehicle vehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found"));

        vehicle.setMake(vehicleDetails.getMake());
        vehicle.setModel(vehicleDetails.getModel());
        vehicle.setYear(vehicleDetails.getYear());
        vehicle.setMileage(vehicleDetails.getMileage());
        vehicle.setRegistrationPaper(vehicleDetails.getRegistrationPaper());
        vehicle.setInsurancePolicy(vehicleDetails.getInsurancePolicy());
        vehicle.setMaintenanceRecord(vehicleDetails.getMaintenanceRecord());
        vehicle.setLastServiceDate(vehicleDetails.getLastServiceDate());
        vehicle.setNextServiceDate(vehicleDetails.getNextServiceDate());

        return vehicleRepository.save(vehicle);
    }

    public void deleteVehicle(Long id) {
        Vehicle vehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found"));

        vehicleRepository.delete(vehicle);
    }
}
