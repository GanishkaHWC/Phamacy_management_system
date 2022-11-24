package com.example.phamacy_management_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Data
@Getter
@AllArgsConstructor
@Setter
public class AddSupplierDto {
    private String name;
    private String salesRep;
    private String nic;
    private String phoneNumber;
}
