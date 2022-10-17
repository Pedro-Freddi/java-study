package com.java.general;

public class Robot {
	
	private String model;
	private double price;
	
	public Robot() {}
	
	public Robot(String model, double price) {
		this.model = model;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getPrice() {
		return price;
	}
	
}
