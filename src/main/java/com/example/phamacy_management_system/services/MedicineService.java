package com.example.phamacy_management_system.services;

import com.example.phamacy_management_system.dto.AddMedicineDto;
import com.example.phamacy_management_system.model.Medicine;

import java.util.List;

public interface MedicineService {
    Medicine save(AddMedicineDto addMedicineDto);
    List<Medicine> searchMedicine(String query);
    Medicine update(Integer id,Double quantity);
    String delete(Integer id);
}
