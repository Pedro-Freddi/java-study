package com.java.modifiers;

public class StaticExampleTest {

	public static void main(String[] args) {
		
		System.out.println("Reading a public static field:\n" + StaticExample.fieldTwo + "\n");
		
		System.out.println("Calling a static method that returns static field values:");
		System.out.println(StaticExample.getStaticFields(2));
		System.out.println(StaticExample.getStaticFields(3));
		System.out.println(StaticExample.getStaticFields(4) + "\n");

		System.out.println("Instantiating the class...");
		StaticExample instance = new StaticExample();
		
		System.out.println("Calling a method that returns non-static field values:");
		System.out.println(instance.getAllFields(1));
		System.out.println(instance.getAllFields(2));
		System.out.println(instance.getAllFields(3));
		System.out.println(instance.getAllFields(4) + "\n");
		
		System.out.println("Reading public fields directly...");
		System.out.println(instance.fieldOne);
		System.out.println("Static fieldTwo read from the instance: " + instance.fieldTwo);
		System.out.println("Static fieldTwo read from the class: " + StaticExample.fieldTwo);
		
	}

}
