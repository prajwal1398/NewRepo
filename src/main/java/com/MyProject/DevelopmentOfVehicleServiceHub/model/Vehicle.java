package com.MyProject.DevelopmentOfVehicleServiceHub.model;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Arrays;
@Component
@Scope("prototype")
@Entity
@Table(name = "vehicles")

public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String make;
    private String model;
    private Integer year;
    private Integer mileage;

    @Lob
    private byte[] registrationPaper;

    @Lob
    private byte[] insurancePolicy;

    @Lob
    private byte[] maintenanceRecord;

    private LocalDate lastServiceDate;
    private LocalDate nextServiceDate;
    //Constructor


    public Vehicle(Long id, String make, String model, Integer year, Integer mileage, byte[] registrationPaper, byte[] insurancePolicy, byte[] maintenanceRecord, LocalDate lastServiceDate, LocalDate nextServiceDate) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.registrationPaper = registrationPaper;
        this.insurancePolicy = insurancePolicy;
        this.maintenanceRecord = maintenanceRecord;
        this.lastServiceDate = lastServiceDate;
        this.nextServiceDate = nextServiceDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public byte[] getRegistrationPaper() {
        return registrationPaper;
    }

    public void setRegistrationPaper(byte[] registrationPaper) {
        this.registrationPaper = registrationPaper;
    }

    public byte[] getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(byte[] insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }

    public byte[] getMaintenanceRecord() {
        return maintenanceRecord;
    }

    public void setMaintenanceRecord(byte[] maintenanceRecord) {
        this.maintenanceRecord = maintenanceRecord;
    }

    public LocalDate getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(LocalDate lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }

    public LocalDate getNextServiceDate() {
        return nextServiceDate;
    }

    public void setNextServiceDate(LocalDate nextServiceDate) {
        this.nextServiceDate = nextServiceDate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", registrationPaper=" + Arrays.toString(registrationPaper) +
                ", insurancePolicy=" + Arrays.toString(insurancePolicy) +
                ", maintenanceRecord=" + Arrays.toString(maintenanceRecord) +
                ", lastServiceDate=" + lastServiceDate +
                ", nextServiceDate=" + nextServiceDate +
                '}';
    }
}

