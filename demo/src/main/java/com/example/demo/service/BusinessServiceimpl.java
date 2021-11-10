package com.example.demo.service;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.common.CommonDto;
import com.example.demo.dao.RegistrationDao;
import com.example.demo.entity.Registration;

import dto.RegistrationDto;

@Service
public class BusinessServiceimpl implements Businessservice {

	@Autowired
	RegistrationDao RD;

	@Override
	public String savadata(Registration registrationDto) {

		try {
			RD.save(registrationDto);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return registrationDto.toString();

	}

	@Override
	public Registration getsavadata(Long mobile) {

		return RD.findById(mobile).get();
	}

	@Override
	public String verifyotp(CommonDto commonDto) {
		Long mobile = commonDto.getMobile();
		int OTP = commonDto.getOtp();
		String Session = commonDto.getSession();

		HttpHeaders headers = new HttpHeaders();
		String Apikey = "c81584bb-4074-11ec-a13b-0200cd936042";
		String url = "http://2factor.in/API/V1/" + Apikey + "/SMS/VERIFY/" + Session + "/" + OTP;
		String rtn2fct = null;
		try {
			RestTemplate restTemplate = new RestTemplate();
			rtn2fct = restTemplate.getForEntity(url, String.class).getBody();

			Registration registrationDto = new Registration();
			registrationDto.setAddress(commonDto.getAddress());
			registrationDto.setDateofbirth(commonDto.getDataofbirth());
			registrationDto.setMobile(commonDto.getMobile());
			registrationDto.setName(commonDto.getName());
			registrationDto.setPassword(commonDto.getPassword());
			registrationDto.setUsername(commonDto.getUsername());
			String savedvalues;
			String Sessionreturned;
			try {
				savedvalues = savadata(registrationDto); // for saving after verifying otp
				try {
					Sessionreturned = processsession(commonDto);
				} catch (Exception ex) {
					System.out.println(ex);
					Sessionreturned = "Error in creating session  ";
				}
			} catch (Exception ex) {
				System.out.println(ex);
				savedvalues = "Error in save ";
			}

		} catch (Exception ex) {
			System.out.println(ex);
			rtn2fct = ex.getMessage();
		}

		return rtn2fct;

	}

	@Override
	public String sendotp(Long mobile) {

		HttpHeaders headers = new HttpHeaders();
		String Apikey = "c81584bb-4074-11ec-a13b-0200cd936042";
		String url = "http://2factor.in/API/V1/" + Apikey + "/SMS/" + mobile + "/AUTOGEN/ABCDEF";
		String rtn2fct = null;
		try {
			RestTemplate restTemplate = new RestTemplate();
			rtn2fct = restTemplate.getForEntity(url, String.class).getBody();
		} catch (Exception ex) {
			System.out.println(ex);

		}

		return rtn2fct;
	}

	@Override
	public String processsession(CommonDto cdto) {
		return null;
	}

}
