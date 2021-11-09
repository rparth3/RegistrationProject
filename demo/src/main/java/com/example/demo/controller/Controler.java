package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Registration;
import com.example.demo.service.BusinessServiceimpl;

import dto.RegistrationDto;

@RestController
@RequestMapping("/Registration")

public class Controler {
	
	@Autowired
	BusinessServiceimpl Service;

	
	@GetMapping(value = "/getsavedata", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Registration getsavedata(@RequestBody Registration registrationDto ) {
		Long mobile ; 
		mobile = registrationDto.getMobile();
		return Service.getsavadata( mobile);	
	}
	@PostMapping(value = "/SendOtp", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String sendotp(@RequestBody Registration registrationDto ) {
		Long mobile ;
		mobile = registrationDto.getMobile();
		return Service.sendotp(mobile);	
	}
	
	@PostMapping(value = "/savedata", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String postdummy(@RequestBody Registration registrationDto ) {
		
		return Service.savadata(registrationDto)		;
		
	}
	

	
}

//
//spring.datasource.url= jdbc:mysql://localhost:3306/mydbforregistrationproject
//spring.datasource.username=root
//spring.datasource.password=password
//spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
