package com.MyProject.DevelopmentOfVehicleServiceHub.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;
@Component
@Scope("prototype")
// Model Package
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serviceName;
    private String serviceDescription;
    private Date serviceDate;
    private Time serviceTime;
    private String technicianName;
    private String equipmentName;
    private ServiceStatus serviceStatus;

    //constructor
    public Service(Long id, String serviceName, String serviceDescription, Date serviceDate, Time serviceTime, String technicianName, String equipmentName, ServiceStatus serviceStatus) {
        this.id = id;
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
        this.serviceDate = serviceDate;
        this.serviceTime = serviceTime;
        this.technicianName = technicianName;
        this.equipmentName = equipmentName;
        this.serviceStatus = serviceStatus;
    }

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public Time getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Time serviceTime) {
        this.serviceTime = serviceTime;
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

}


