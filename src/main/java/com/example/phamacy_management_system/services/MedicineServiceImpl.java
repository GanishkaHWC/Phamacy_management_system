package com.example.phamacy_management_system.services;

import com.example.phamacy_management_system.dto.AddMedicineDto;
import com.example.phamacy_management_system.model.Medicine;
import com.example.phamacy_management_system.repository.MedicineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService{

    private MedicineRepository medicineRepository;

    public MedicineServiceImpl(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    @Override
    public Medicine save(AddMedicineDto addMedicineDto) {
        Medicine m = new Medicine(addMedicineDto.getName(), addMedicineDto.getPrice(),
                addMedicineDto.getBrand(), addMedicineDto.getDescription(), addMedicineDto.getDose(),
                addMedicineDto.getDosageForm(), addMedicineDto.getQuantity());

        return medicineRepository.save(m);
    }

    @Override
    public List<Medicine> searchMedicine(String query) {
        List<Medicine> medicines= medicineRepository.searchMedicine(query);
        return medicines;
    }

    @Override
    public Medicine update(Integer id,Double quantity) {
        Medicine medicine = medicineRepository.findById(id).get();
        Double newQuantity=medicine.getQuantity()+quantity;
        medicine.setQuantity(newQuantity);
        return  medicineRepository.save(medicine);
    }

    @Override
    public String delete(Integer id) {
        medicineRepository.deleteById(id);
        return "Done";
    }
}
