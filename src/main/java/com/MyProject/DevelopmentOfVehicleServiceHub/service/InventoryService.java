package com.MyProject.DevelopmentOfVehicleServiceHub.service;

import com.MyProject.DevelopmentOfVehicleServiceHub.model.Inventory;
import com.MyProject.DevelopmentOfVehicleServiceHub.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getInventoryById(Long id) {
        return inventoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Inventory not found"));
    }

    public Inventory createInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public Inventory updateInventory(Long id, Inventory inventoryDetails) {
        Inventory inventory = getInventoryById(id);
        inventory.setPartNumber(inventoryDetails.getPartNumber());
        inventory.setDescription(inventoryDetails.getDescription());
        inventory.setQuantity(inventoryDetails.getQuantity());
        inventory.setReorderPoint(inventoryDetails.getReorderPoint());
        inventory.setLastRestockDate(inventoryDetails.getLastRestockDate());
        inventory.setNextRestockDate(inventoryDetails.getNextRestockDate());
        return inventoryRepository.save(inventory);
    }

    public void deleteInventory(Long id) {
        inventoryRepository.deleteById(id);
    }

    public List<Inventory> getLowStockInventories() {
        return inventoryRepository.findByQuantityLessThanEqual(10);
    }

    public List<Inventory> getOverstockInventories() {
        return inventoryRepository.findByQuantityGreaterThan(50);
    }

    public Inventory getInventoryByPartNumber(String partNumber) {
        return inventoryRepository.findByPartNumber(partNumber);
    }


}

