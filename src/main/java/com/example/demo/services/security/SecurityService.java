package com.example.demo.services.security;

import org.springframework.stereotype.Service;

@Service
public interface SecurityService {
	String md5(String password);
}
