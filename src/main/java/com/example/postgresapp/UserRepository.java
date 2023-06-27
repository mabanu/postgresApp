package com.example.postgresapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Costumer, Long> {
}
