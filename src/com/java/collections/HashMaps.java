package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		// Add pairs of key:value to the map
		map.put("apples", "red");
		map.put("oranges", "orange");
		map.put("bananas", "yellow");
		
		System.out.println("The size of the map is: " + map.size());
		
		System.out.println("The map contains bananas: " + map.containsKey("bananas"));
		System.out.println("The map contains strawberries: " + map.containsKey("strawberries"));
		System.out.println("The value of the key apples is: " + map.get("apples"));
		
		// Remove the key:value with key "oranges"
		String oranges = map.remove("oranges");
		System.out.println("The value of the key \"oranges\" was:" + oranges);
		
		System.out.println("The map is now: " + map);
		
	}
	
}
