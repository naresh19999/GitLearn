package com.angularBoot.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angularBoot.main.model.UserRegister;
import com.angularBoot.main.repository.RegRepo;

@Service
public class RegisterService {
	
	@Autowired
	private RegRepo regRepo;
	
	public UserRegister saveUser(UserRegister user) {		
		return regRepo.save(user);		
	}
	public UserRegister fetchUserByPass(String passport) {
		return regRepo.findByPassportNumber(passport);
	}

}
