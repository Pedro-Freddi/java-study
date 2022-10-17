package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		
		// Instantiate a new ArrayList
		List<String> list = new ArrayList<String>();
		
		// Add elements to the end of the list
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		
		System.out.println(list.size());
		System.out.println(list.get(3));
		
		// Set method replaces an element at the specified index
		list.set(3, "New Fourth");
		
		System.out.println(list.size());
		System.out.println(list.get(3));
		
		// Remove method deletes the element at the specified index
		list.remove(2);
		System.out.println(list.get(2));
		
		// Iterate through the list and print the elements
		System.out.println("=== Print All Elements ===");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// Find the index (or the last index) of an element
		list.add("First");
		System.out.println(list.indexOf("First"));
		System.out.println(list.lastIndexOf("First"));
		
		// Check if the list contains an element
		System.out.println(list.contains("Second"));
		
		// Return an array of the list
		Object[] array = list.toArray();
		// Print the array as a string
		System.out.println(Arrays.toString(array));
		
		// Print the list (it's automatically converted to a string)
		System.out.println(list);
		
	}

}
