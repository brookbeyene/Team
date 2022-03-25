package com.example.inventory.rest.Controller;

import com.example.inventory.rest.Model.Motorcycle;
import com.example.inventory.rest.Repository.InventoryRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/motor")
public class InventoryController {
    private final InventoryRepository inventoryRepository;


    public InventoryController(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }
    @GetMapping("/home")
    public String homePage(){
        return "This is the home page";
    }

    @PostMapping("/")
    Motorcycle newMotorcycle(@RequestBody Motorcycle newMotorcycle) {
        return inventoryRepository.save(newMotorcycle);
    }
}
