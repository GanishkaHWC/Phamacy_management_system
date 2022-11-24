package com.example.phamacy_management_system.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Integer id;
    private  String name;
    private String salesRep;
    private String nic;
    private String phoneNumber;

    public Supplier(String name, String salesRep, String nic, String phoneNumber) {
        this.name = name;
        this.salesRep = salesRep;
        this.nic = nic;
        this.phoneNumber = phoneNumber;
    }
}
