package com.example.demo.services.security;

import org.springframework.stereotype.Service;

@Service
public interface User {
	String getPassword();

	void setPassword(String passwordMd5);
}
