package com.java.general;

public class StringMethods {

	public static void main(String[] args) {
		
		System.out.println("=== Comparison ===");
		
		// String comparison and equality
		// Comparison operator "==" is not recommended
		// It works only if the strings were not instantiated using the "new" operator
		String text = "Test string";
		String text2 = "Test string";
		System.out.println(text == text2); // returns true
		
		// But if one or both strings are explicitly instantiated, it won't work
		String text3 = new String("Test string");
		System.out.println(text == text3); // returns false
		
		// The operator "==" compares the variable's memory address reference
		// and not the values they hold. Instantiated strings each have their
		// own address in the memory heap; otherwise they're allocated in a pool 
		// of strings, where strings holding the same value will have matching
		// memory addresses
		
		// The equals() method - case sensitive
		String text4 = "TEST STRING";
		System.out.println(text.equals(text2)); // returns true
		System.out.println(text.equals(text3)); // returns true
		System.out.println(text.equals(text4)); // returns false
		
		// The equalsIgnoreCase() - case insensitive
		System.out.println(text.equalsIgnoreCase(text4)); // returns true
		System.out.println(text3.equalsIgnoreCase(text4)); // returns true
		
		// The NOT operator "!" can be used to check if strings are different
		System.out.println(!text.equals(text2)); // returns false
		System.out.println(!text.equals(text4)); // returns true
		
		System.out.println("\n=== Attribute Verification Methods ===");
		
		// Check if a string starts with a defined sequence of characters
		// This and the following methods are all case sensitive
		System.out.println(text.startsWith("Test")); // returns true
		System.out.println("ABCDE".startsWith("A")); // returns true
		
		// Check if a string ends with a defined sequence of characters
		System.out.println(text.endsWith("string")); // returns true
		System.out.println("ABCDE".endsWith("E")); // returns true
		
		// Check a string's length. Note that it's a method, not an attribute
		// as it is in an array
		String lengthCheck = "How many characters does this string have?";
		System.out.println("It has: " + lengthCheck.length() + " characters.");
		
		System.out.println("\n=== Search and Manipulation Methods ===");

		// Find the character at a given position of the string
		System.out.println(text.charAt(2)); // returns "s"
		System.out.println(text.charAt(0)); // returns "T"
		
		// Find the index of a given characters in a string
		// Returns -1 if the characters is not in the string
		System.out.println(text.indexOf("s")); // returns 2
		System.out.println(text.indexOf("z")); // returns -1
		
		// The indexOf method can also find substrings in a string
		System.out.println(text.indexOf("string")); // returns 5
		
		// Find the last index of a character or substring
		System.out.println(text.lastIndexOf("s")); // returns 5
		System.out.println("abcabcabc".lastIndexOf("abc")); // returns 6
		
		// Extract a substring from a string
		// Last character is not inclusive
		String substring = text.substring(text.indexOf("string"));
		System.out.println(substring); // returns "string"
		
		// Convert all characters in a string to uppercase or lowercase
		System.out.println(text.toUpperCase()); // returns "TEXT STRING"
		System.out.println(text.toLowerCase()); // returns "text string"
		System.out.println(text.substring(text.indexOf("string")).toUpperCase());
		
		// Replace a character or a substring in a string for another character or
		// substring. Note that it returns a new string because strings are immutable
		// in Java
		System.out.println(text.replace("s", "x")); // returns "Text xtring"
		System.out.println(text.replace("string", "word")); // returns "Test word"
		
		// Split a string in multiple substrings, returning an array of substrings
		String text5 = "A test string with reasonable length for manipulation.";
		String[] arrayOfStrings = text5.split(" ");
		System.out.println(arrayOfStrings[1]); // returns test
		System.out.println(arrayOfStrings[4]); // returns reasonable
		
	}

}
