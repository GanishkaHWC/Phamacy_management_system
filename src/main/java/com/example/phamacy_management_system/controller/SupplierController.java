package com.example.phamacy_management_system.controller;


import com.example.phamacy_management_system.dto.AddSupplierDto;
import com.example.phamacy_management_system.model.Supplier;
import com.example.phamacy_management_system.services.SupplierService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {


    private SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addSupplier(@Valid @RequestBody AddSupplierDto addSupplierDto){
        supplierService.save(addSupplierDto);
        return ResponseEntity.ok("Supplier added successfully!");
    }
    @GetMapping("/find")
    public ResponseEntity<List<Supplier>> findSupplier(){
        return ResponseEntity.ok(supplierService.findAll());
    }
}
