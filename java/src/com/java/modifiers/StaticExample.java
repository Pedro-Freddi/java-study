package com.java.modifiers;

public class StaticExample {

	// Can be accessed by any other class
	// Can have another value attributed to it
	// Class must be instantiated before this field can be read or changed
	public String fieldOne = "Non-static public field";
	
	// Can be accessed by any other class
	// Can have another value attributed to it
	// Class does not need to be instantiated before this field can be read or changed
	public static String fieldTwo = "Static public field";
	
	// Can only be seen inside this class
	// Can have another value attributed to it
	// Class does not need to be instatiated before this field can be read or changed
	private static String fieldThree = "Static private field";
	
	// Can only be seen inside this class
	// Can not have another value attributed to it
	// Class does not need to be instatiated before this field can be read or changed
	private static final String FIELD_FOUR = "Static private final field";
	
	public String getAllFields(int fieldNumber) {
		switch (fieldNumber) {
		case 1: 
			return fieldOne;
		case 2: 
			return fieldTwo;
		case 3:
			return fieldThree;
		case 4:
			return FIELD_FOUR;
		default: 
			return "Invalid input";
		}
	}
	
	// Static methods can only reference static fields
	// Class does not need to be instantiated to have one of its
	// static methods called
	public static String getStaticFields(int fieldNumber) {
		switch (fieldNumber) {
		case 2:
			return fieldTwo;
		case 3:
			return fieldThree;
		case 4:
			return FIELD_FOUR;
		default:
			return "Invalid input";
		}
	}
	
}
