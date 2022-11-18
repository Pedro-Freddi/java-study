package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSets {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		// Add elements to the set
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		
		// Adding a repeated element has no effect on the set
		set.add("Second");
		
		// Check if the set contains an element
		System.out.println(set.contains("Third"));
		System.out.println(set.contains("Fifth"));
		
		System.out.println(set.size());
		
		// Print the set as a string
		System.out.println(set.toString());
		
		// Print the set (it's converted to a string automatically)
		System.out.println(set);

	}

}
