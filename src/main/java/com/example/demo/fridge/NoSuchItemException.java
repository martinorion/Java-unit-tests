package com.example.demo.fridge;

public class NoSuchItemException extends Exception {
	public NoSuchItemException(String message) {
		super(message);
	}
}
