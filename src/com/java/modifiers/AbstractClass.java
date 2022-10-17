package com.java.modifiers;

public abstract class AbstractClass {

	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract boolean hasName();
}
