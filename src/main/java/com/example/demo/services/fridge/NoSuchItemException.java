package com.example.demo.services.fridge;

public class NoSuchItemException extends Exception {
	public NoSuchItemException(String message) {
		super(message);
	}
}
