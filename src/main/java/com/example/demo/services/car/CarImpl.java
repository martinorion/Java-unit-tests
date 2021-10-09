package com.example.demo.services.car;

import java.awt.*;
import java.util.Objects;

public class CarImpl implements Car{

	private Engine engine;
	private Color color;
	private Manufacturer manufacturer;

	public CarImpl(Engine engine, Color color, Manufacturer manufacturer) {
		this.color = color;
		this.engine = engine;
		this.manufacturer = manufacturer;
	}

	public Engine getEngine() {
		return engine;
	}

	public Color getColor() {
		return color;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}
}
