package com.java.modifiers;

public class ConcreteClassTest {

	public static void main(String[] args) {
		
		ConcreteClass concrete = new ConcreteClass();
		
		concrete.setName("Concrete Class Instance");
		
		String className = concrete.getName();
		
		System.out.println("Class name is: " + className);
		
		System.out.println("Setting name to null...");
		concrete.setName(null);
		
		System.out.println("Has a name? " + concrete.hasName());

	}

}
