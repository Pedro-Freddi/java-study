package com.java.modifiers;

public interface InterfaceExampleOne {

	// Attributes/fields defined in an interface are implicity public, final and static
	String FIELD_ONE = "Hello from the interface!";
	double CONSTANT_NUMBER = 3.14;
	
	// Interface can define static methods
	// These can't be overwritten in a class that implements this interface
	static boolean staticMethodOneWorks() {
		return true;
	}
	
	// Default methods can be defined in the interface
	// These can be overwritten in a class and need an instance of the class
	// before they can be called
	default boolean defaultMethodOneWorks() {
		return true;
	}
	
	// Abstract methods defined in the interface need to be implemented in the class
	// Note that the method is implicitly abstract
	boolean hasToImplementMethodFromFirstInterface();

}
