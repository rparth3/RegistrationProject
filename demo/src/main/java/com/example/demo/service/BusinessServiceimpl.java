package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RegistrationDao;
import com.example.demo.entity.Registration;

import dto.RegistrationDto;

@Service
public class BusinessServiceimpl implements Businessservice {
	
	
	
	@Autowired
	RegistrationDao RD ;
	
	@Override 
	public String savadata (Registration registrationDto) {
		
		
		
		 try {
		RD.save(registrationDto); 
		 }
		 catch(Exception ex) {
			System.out.println(ex);
		 }
		return registrationDto.toString();
		
		
		
	}
	@Override
	public Registration	getsavadata (int mobile) {
		
		return RD.findById(mobile).get();
	}
	
	@Override
	public String sendotp(int mobile) {
		return "86756";
	}
	
}
