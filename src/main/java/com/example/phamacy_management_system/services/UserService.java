package com.example.phamacy_management_system.services;

import com.example.phamacy_management_system.dto.UserRegistrationDto;
import com.example.phamacy_management_system.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public interface UserService {


    User save(UserRegistrationDto userRegistrationDto);

}
