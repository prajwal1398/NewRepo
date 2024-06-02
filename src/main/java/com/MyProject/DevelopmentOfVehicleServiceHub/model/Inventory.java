package com.MyProject.DevelopmentOfVehicleServiceHub.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Arrays;
@Component
@Scope("prototype")
@Entity
@Table(name = "inventories")

public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partNumber;
    private String description;
    private Integer quantity;
    private Double reorderPoint;
    private LocalDate lastRestockDate;
    private LocalDate nextRestockDate;

    public Inventory(Long id, String partNumber, String description, Integer quantity, Double reorderPoint, LocalDate lastRestockDate, LocalDate nextRestockDate, byte[] document) {
        this.id = id;
        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.reorderPoint = reorderPoint;
        this.lastRestockDate = lastRestockDate;
        this.nextRestockDate = nextRestockDate;
        this.document = document;
    }

    @Lob
    private byte[] document;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getReorderPoint() {
        return reorderPoint;
    }

    public void setReorderPoint(Double reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    public LocalDate getLastRestockDate() {
        return lastRestockDate;
    }

    public void setLastRestockDate(LocalDate lastRestockDate) {
        this.lastRestockDate = lastRestockDate;
    }

    public LocalDate getNextRestockDate() {
        return nextRestockDate;
    }

    public void setNextRestockDate(LocalDate nextRestockDate) {
        this.nextRestockDate = nextRestockDate;
    }

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", partNumber='" + partNumber + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", reorderPoint=" + reorderPoint +
                ", lastRestockDate=" + lastRestockDate +
                ", nextRestockDate=" + nextRestockDate +
                ", document=" + Arrays.toString(document) +
                '}';
    }
}
