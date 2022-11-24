package com.example.phamacy_management_system.services;

import com.example.phamacy_management_system.dto.AddSupplierDto;
import com.example.phamacy_management_system.model.Supplier;
import com.example.phamacy_management_system.repository.SupplierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService{

    private SupplierRepository supplierRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Supplier save(AddSupplierDto addSupplierDto) {
        System.out.println(addSupplierDto.getNic());
        Supplier s =new Supplier(addSupplierDto.getName(),
                addSupplierDto.getSalesRep(),addSupplierDto.getNic(),
                addSupplierDto.getPhoneNumber());

        return supplierRepository.save(s);
    }

    @Override
    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }
}
