package com.MyProject.DevelopmentOfVehicleServiceHub.service;
// Service Package
import com.MyProject.DevelopmentOfVehicleServiceHub.model.ServiceStatus;
import com.MyProject.DevelopmentOfVehicleServiceHub.model.Service;
import com.MyProject.DevelopmentOfVehicleServiceHub.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.*;

@org.springframework.stereotype.Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }

    public Service getServiceById(Long id) {
        return serviceRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Service not found"));
    }

    public Service createService(Service service) {
        return serviceRepository.save(service);
    }

    public Service updateService(Long id, Service serviceDetails) {
        Service service = getServiceById(id);
        service.setServiceName(serviceDetails.getServiceName());
        service.setServiceDescription(serviceDetails.getServiceDescription());
        service.setServiceDate(serviceDetails.getServiceDate());
        service.setServiceTime(serviceDetails.getServiceTime());
        service.setTechnicianName(serviceDetails.getTechnicianName());
        service.setEquipmentName(serviceDetails.getEquipmentName());
        service.setServiceStatus(serviceDetails.getServiceStatus());
        return serviceRepository.save(service);
    }

    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }

    public List<Service> getServicesByStatus(ServiceStatus serviceStatus) {
        return serviceRepository.findByServiceStatus(serviceStatus);
    }

    public List<Service> getServicesByTechnicianName(String technicianName) {
        return serviceRepository.findByTechnicianName(technicianName);
    }

    public List<Service> getServicesByEquipmentName(String equipmentName) {
        return serviceRepository.findByEquipmentName(equipmentName);
    }
}