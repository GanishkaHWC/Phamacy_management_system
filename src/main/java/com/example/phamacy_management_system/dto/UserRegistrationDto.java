package com.example.phamacy_management_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@AllArgsConstructor
@Setter
public class UserRegistrationDto {
    private String name;
    private String username;
    private String email;
    private String password;

}
