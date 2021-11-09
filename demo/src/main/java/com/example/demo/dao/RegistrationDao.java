package com.example.demo.dao;

import com.example.demo.entity.Registration;

import dto.RegistrationDto;

import org.springframework.data.jpa.repository.JpaRepository;


public interface RegistrationDao extends JpaRepository<Registration,Integer> {

	
}
 