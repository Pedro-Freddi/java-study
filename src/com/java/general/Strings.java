package com.java.general;

public class Strings {
	
	public static void main(String[] args) {
		
		// Two ways to create a string
		String text = new String("Hello Java");
		String textTwo = "Hello Java, again";
		
		System.out.println(text);
		System.out.println(textTwo);
		
		// Using escape sequences on a string
		System.out.println("A string!\nNow on a new line.");
		System.out.println("Look ma', I'm using \"double quotes\"");
		System.out.println("Now using the \\backslash\\");
		
		// String concatenation
		// Using the "+" operator
		String firstName = "Peter";
		String lastName = "Parker";
		String fullName = firstName + " " + lastName;
		
		System.out.println("The full name is: " + fullName + ".");
		
		// Using the "+=" operator
		String productName = "Apples";
		String productDescription = "they are red and delicious!";
		String product = new String();
		product += productName;
		product += ": ";
		product += productDescription;
		product += ".";
		
		System.out.println(product);
		
		// Using the concat method
		String language = "Java";
		String version = "SE-17";
		String langAndVersion = language.concat(" ").concat(version).concat(".");
		
		System.out.println(langAndVersion);
		
	}
}
