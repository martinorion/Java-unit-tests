package com.example.demo.services.car;

import java.util.Objects;

public class Engine {
	private int numberOfCylinders;

	public Engine(int numberOfCylinders)
	{
		this.numberOfCylinders = numberOfCylinders;
	}

	public int getNbOfCylinders()
	{
		return numberOfCylinders;
	}
}