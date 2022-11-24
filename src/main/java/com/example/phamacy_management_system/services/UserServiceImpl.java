package com.example.phamacy_management_system.services;

import com.example.phamacy_management_system.dto.UserRegistrationDto;
import com.example.phamacy_management_system.model.User;
import com.example.phamacy_management_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    private PasswordEncoder encoder;



    @Override
    public User save(UserRegistrationDto userRegistrationDto) {
        User user=new User(userRegistrationDto.getName(),
                userRegistrationDto.getUsername(),
                userRegistrationDto.getEmail(),
                encoder.encode(userRegistrationDto.getPassword()));
        System.out.println(user.getEmail());
        return userRepository.save(user);
    }
}
