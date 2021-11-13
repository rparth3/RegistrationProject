package com.example.demo.service;

import com.example.demo.common.CommonDto;
import com.example.demo.entity.Registration;

import dto.RegistrationDto;

public interface Businessservice {
public String savadata(Registration registrationDto);
public Registration getsavadata(Long mobile);
public String sendotp(Long mobile);
public String verifyotp(CommonDto commonDto);
public String processsession(CommonDto cdto);
public String login(Long mobile,String password);
public String destroysession(CommonDto cdto) ;
public String logout(CommonDto cdto) ;

}
