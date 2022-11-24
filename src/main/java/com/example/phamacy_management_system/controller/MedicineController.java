package com.example.phamacy_management_system.controller;

import com.example.phamacy_management_system.dto.AddMedicineDto;
import com.example.phamacy_management_system.dto.UpdateStockDto;
import com.example.phamacy_management_system.model.Medicine;
import com.example.phamacy_management_system.services.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/medicine")
public class MedicineController {

    private MedicineService medicineService;

    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addMedicine( @Valid @RequestBody AddMedicineDto addMedicineDto){
        medicineService.save(addMedicineDto);
        return ResponseEntity.ok("Medicine added successfully!");
    }

    @GetMapping("/search")
    public ResponseEntity<List<Medicine>> searchMedicine(@RequestParam("query") String query){

        return ResponseEntity.ok(medicineService.searchMedicine(query));
    }
    @PutMapping("/update")
    public ResponseEntity <?> updateQuantity(@Valid @RequestBody UpdateStockDto updateStockDto){
        medicineService.update(updateStockDto.getId(),updateStockDto.getQuantity());
        return  ResponseEntity.ok("Stock updated successfully!");
    }
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<?> removeMedicine(@PathVariable Integer id){
        medicineService.delete(id);
        return ResponseEntity.ok("Medicine removed successfully!");

    }
}
