package com.demo.swagger;

import com.demo.swagger.model.Role;
import com.demo.swagger.model.UserEntity;
import com.demo.swagger.repository.RoleRepository;
import com.demo.swagger.repository.UserEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
class SwaggerApplicationTests {

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    @Autowired
    private UserEntityRepository repo;
    @Autowired
    private RoleRepository roleRepository;

    @Test
    void contextLoads() {
        repo.saveAll(getUserS());

    }


    public List< UserEntity > getUserS() {
        Role role1 = new Role();
        role1.setName(Role.USER);
        role1 = roleRepository.save(role1);
        Role role2 = new Role();
        role2.setName(Role.ROLE_ADMIN);
        role2 = roleRepository.save(role2);
        Role role3 = new Role();
        role3.setName(Role.ADMIN);
        role3 = roleRepository.save(role3);

        Set< Role > roleSet = new HashSet<>();
        //roleRepository.saveAll(Arrays.asList(role1,role2,role3));

        UserEntity user1 = UserEntity.builder().username("user1")
                .password(passwordEncoder.encode("password"))
                .roles(roleSet)
                .build();
        UserEntity user2 = UserEntity.builder().username("user2")
                .password(passwordEncoder.encode("password"))
                .roles(roleSet)
                .build();
        UserEntity admin = UserEntity.builder().username("admin")
                .password(passwordEncoder.encode("password"))
                .roles(roleSet)
                .build();
        return Arrays.asList(user1, user2, admin);
    }
}
