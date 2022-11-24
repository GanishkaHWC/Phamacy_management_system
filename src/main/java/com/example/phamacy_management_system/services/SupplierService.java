package com.example.phamacy_management_system.services;

import com.example.phamacy_management_system.dto.AddSupplierDto;
import com.example.phamacy_management_system.model.Supplier;

import java.util.List;


public interface SupplierService  {
    Supplier save(AddSupplierDto addSupplierDto);
    List<Supplier> findAll();
}
