package com.example.phamacy_management_system;

import com.example.phamacy_management_system.model.User;
import com.example.phamacy_management_system.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;




    @DataJpaTest
    @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
    @Rollback(false)
    public class UserRepositoryTests {

        //@Autowired
        //private TestEntityManager entityManager;

        @Autowired
        private UserRepository repo;

        @Test
        public void testCreateUser() {
            User user = new User();
            user.setEmail("ravikumar@gmail.com");
            user.setPassword("ravi2020");
            user.setName("Ganishka");

            User savedUser = repo.save(user);

           // User existUser = entityManager.find(User.class, savedUser.getId());

            //assertThat(user.getEmail()).isEqualTo(existUser.getEmail());

        }
    }
