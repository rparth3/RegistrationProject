package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.CommonDto;
import com.example.demo.entity.Registration;
import com.example.demo.service.BusinessServiceimpl;

import dto.LoginDto;
import dto.RegistrationDto;
import dto.VerfyDto;

@RestController
@RequestMapping("Registration/")

public class Controler {
	
	@Autowired
	BusinessServiceimpl Service;

	
	@GetMapping(value = "getsavedata", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Registration getsavedata(@RequestBody Registration registrationDto ) {
		Long mobile ; 
		mobile = registrationDto.getMobile();
		return Service.getsavadata( mobile);	
	}
	@PostMapping(value = "SendOtp", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String sendotp(@RequestBody Registration registrationDto ) {
		Long mobile ;
		mobile = registrationDto.getMobile();
		return Service.sendotp(mobile);	
	}
	
	@PostMapping(value = "verifyOtp", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String verifyotp(@RequestBody CommonDto commonDto) {
		Long mobile ;
		return Service.verifyotp(commonDto);	
	}
	
	@PostMapping(value = "savedata", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String postdummy(@RequestBody Registration registrationDto ) {
		
		return Service.savadata(registrationDto)		;
		
	}
	
	@PostMapping(value = "login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String login(@RequestBody LoginDto loginDto ) {
		Long mobile = loginDto.getMobile();
		String password = loginDto.getPassword(); 
		return Service.login(mobile,password);
		
	}
	
	@PostMapping(value = "logout", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String logout(@RequestBody CommonDto commonDto) {
		return Service.logout(commonDto);
		
	}
	

	
}