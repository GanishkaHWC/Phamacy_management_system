package com.example.phamacy_management_system.repository;

import com.example.phamacy_management_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Override
    default List<User> findAll() {
        return null;
    }

    User  findByUsername(String username);
}