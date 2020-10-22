package com.angularBoot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angularBoot.main.model.UserRegister;

public interface RegRepo extends JpaRepository<UserRegister, Integer> {
	
	public UserRegister findByPassportNumber(String passportNumber);

}
