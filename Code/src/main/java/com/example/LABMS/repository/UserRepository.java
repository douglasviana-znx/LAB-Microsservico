package com.example.LABMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LABMS.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}