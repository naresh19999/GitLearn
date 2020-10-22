package com.angularBoot.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.angularBoot.main.model.UserRegister;
import com.angularBoot.main.service.RegisterService;

@RestController
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@PostMapping("/register")
	@CrossOrigin(origins = "htpp://localhost:4200")
	public UserRegister registUser(@RequestBody UserRegister userRegister) throws Exception {
		String tempPass = userRegister.getPassportNumber();
		if(tempPass!=null && !"".equals(tempPass)) {
			UserRegister userObj = registerService.fetchUserByPass(tempPass);
			if(userObj != null) {
				throw new Exception("passport with "+tempPass+"is already exist");
			}
		}
		UserRegister userObj = null;
		userObj = registerService.saveUser(userRegister);
		return userObj;
	}
	
	@GetMapping("/status")
	public String applicationStatus() {
		return "Your Application is in progress!!";
	}
	

}
