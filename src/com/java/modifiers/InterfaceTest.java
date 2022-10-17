package com.java.modifiers;

public class InterfaceTest {

	public static void main(String[] args) {
		
		System.out.println("We can read attributes directly from an interface:");
		
		System.out.println(InterfaceExampleOne.FIELD_ONE);
		System.out.println(InterfaceExampleOne.CONSTANT_NUMBER);
		
		System.out.println(InterfaceExampleTwo.FIELD_ONE);
		System.out.println(InterfaceExampleTwo.CONSTANT_NUMBER);
		
		System.out.println("\nOr invoke static methods of an interface");
		
	    System.out.println(InterfaceExampleOne.staticMethodOneWorks());
	    System.out.println(InterfaceExampleTwo.staticMethodTwoWorks());
	    
	    System.out.println("\nNow let's instantiate a class that implements both interfaces");
	    
	    InterfaceImplementationExample classInstance = new InterfaceImplementationExample();
	    
	    System.out.println("We can read a field of the instance: " + classInstance.classField);
	    System.out.println("\nOr call methods specified in the interface but implemented in the class: ");
	    System.out.println(classInstance.hasToImplementMethodFromFirstInterface());
	    System.out.println(classInstance.hasToImplementMethodFromSecondInterface());
	    
	    System.out.println("\nOr even call default methods specified and implemented directly in the interface");
	    System.out.println(classInstance.defaultMethodOneWorks());
	    System.out.println(classInstance.defaultMethodTwoWorks());
	    
	    System.out.println("\nFinal tests:");
	    System.out.println("Class is instance of InterfaceOne: " + (classInstance instanceof InterfaceExampleOne));
	    System.out.println("Class is instance of InterfaceTwo: " + (classInstance instanceof InterfaceExampleTwo));
	    System.out.println("Class is instance of InterfaceImplementationExample class: " + (classInstance instanceof InterfaceImplementationExample));
		
	}
	
}
