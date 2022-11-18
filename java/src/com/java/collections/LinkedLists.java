package com.java.collections;

import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		
		// Declare, instantiate and initialize a LinkedList variable
		LinkedList<String> list = new LinkedList<String>();
		
		// Add elements to the list
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		
		// Peek at the first and the last elements of the list
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		
		String first = list.removeFirst();
		System.out.println("Removed the first element: " + first);
		
		String last = list.removeLast();
		System.out.println("Removed the last element: " + last);
		
		System.out.println(list);

	}

}
