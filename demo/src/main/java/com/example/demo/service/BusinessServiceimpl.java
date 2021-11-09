package com.example.demo.service;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.common.Rtn2factor;
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
	public Registration	getsavadata (Long mobile) {
		
		return RD.findById(mobile).get();
	}
	
	@Override
	public String sendotp(Long mobile) {
		
		 HttpHeaders headers = new HttpHeaders();
		 String Apikey ="c81584bb-4074-11ec-a13b-0200cd936042";
		 String url = "http://2factor.in/API/V1/"+Apikey +"/SMS/"+mobile +"/AUTOGEN/ABCDEF";
		 Rtn2factor r = null;
		 String err =null;
		 try {
		    RestTemplate restTemplate = new RestTemplate();
		  r  = 
		    		restTemplate.getForEntity
		    		(url
		    		, Rtn2factor.class)
		    		.getBody();
		 }
		 catch(Exception ex) {
			System.out.println(ex);
			r.setDetails(ex.getMessage());
		 }
		 
		return r.toString();
	}
	
}
