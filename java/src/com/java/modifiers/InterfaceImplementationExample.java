package com.java.modifiers;

public class InterfaceImplementationExample implements InterfaceExampleOne, InterfaceExampleTwo {

	public String classField = "I'm a string field of the class";
	
	@Override
	public boolean hasToImplementMethodFromFirstInterface() {
		return true;
	}
	
	@Override
	public boolean hasToImplementMethodFromSecondInterface() {
		return true;
	}
	
}
