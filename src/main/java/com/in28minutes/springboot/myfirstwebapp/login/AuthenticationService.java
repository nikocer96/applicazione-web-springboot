package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		
		boolean isValidUrsername = username.equals("in28minutes");
		boolean isValidPassword = password.equals("dummy");
		
		return isValidUrsername && isValidPassword;
	}
}
