package com.example.demo.service;

import com.example.demo.entity.Registration;

import dto.RegistrationDto;

public interface Businessservice {
public String savadata(Registration registrationDto);
public Registration getsavadata(Long mobile);
public String sendotp(Long mobile);
}
