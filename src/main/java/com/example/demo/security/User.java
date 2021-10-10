package com.example.demo.security;

import org.springframework.stereotype.Service;

@Service
public interface User {
	String getPassword();

	void setPassword(String passwordMd5);
}
