package com.example.phamacy_management_system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicine {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Id;
    private String Name;
    private Double Price;
    private String Brand;
    private String

}
