package com.example.inventory.rest.Repository;

import com.example.inventory.rest.Model.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Motorcycle, Long> {

    List<Motorcycle> findByType(String type);

    Motorcycle findByVIN(int VIN);

    List<Motorcycle> findByMake(String make);
}
