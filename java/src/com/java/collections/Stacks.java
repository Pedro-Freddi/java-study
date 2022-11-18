package com.java.collections;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		
		// Declare, initialize and instantiate a stack variable
		Stack<String> stack = new Stack<String>();
		
		// Add elements to the stack 
		// Stack is Last-In-First-Out data structure
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		stack.push("Fourth");
		
		// Pop the last element added to the stack
		String last = stack.pop();
		
		System.out.println("The last element of the stack was: " + last);

		System.out.println(stack);
	}

}
