package com.MyProject.DevelopmentOfVehicleServiceHub.controller;
import com.MyProject.DevelopmentOfVehicleServiceHub.model.Service;
import com.MyProject.DevelopmentOfVehicleServiceHub.model.ServiceStatus;
import com.MyProject.DevelopmentOfVehicleServiceHub.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
// Controller Package
@RestController
@RequestMapping("/api/services")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public List<Service> getAllServices() {
        return serviceService.getAllServices();
    }

    @GetMapping("/{id}")
    public Service getServiceById(@PathVariable Long id) {
        return serviceService.getServiceById(id);
    }

    @PostMapping
    public Service createService(@RequestBody Service service) {
        return serviceService.createService(service);
    }

    @PutMapping("/{id}")
    public Service updateService(@PathVariable Long id, @RequestBody Service serviceDetails) {
        return serviceService.updateService(id, serviceDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable Long id) {
        serviceService.deleteService(id);
    }

    @GetMapping("/status/{serviceStatus}")
    public List<Service> getServicesByStatus(@PathVariable ServiceStatus serviceStatus) {
        return serviceService.getServicesByStatus(serviceStatus);
    }

    @GetMapping("/technician/{technicianName}")
    public List<Service> getServicesByTechnicianName(@PathVariable String technicianName) {
        return serviceService.getServicesByTechnicianName(technicianName);
    }

    @GetMapping("/equipment/{equipmentName}")
    public List<Service> getServicesByEquipmentName(@PathVariable String equipmentName) {
        return serviceService.getServicesByEquipmentName(equipmentName);
    }
}