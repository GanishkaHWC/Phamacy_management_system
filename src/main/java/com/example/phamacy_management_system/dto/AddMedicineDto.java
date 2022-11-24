package com.example.phamacy_management_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@AllArgsConstructor
@Setter
public class AddMedicineDto {
    private String name;
    private Double price;
    private String brand;
    private String description;
    private String dose;
    private String dosageForm;
    private Double quantity;
}
