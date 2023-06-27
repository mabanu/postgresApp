package com.example.postgresapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostgresController {

    private final UserRepository userRepository;

    public PostgresController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public List<Costumer> GetUsers(){
        return userRepository.findAll();
    }
}
