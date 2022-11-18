package com.java.modifiers;

public class ConcreteClass extends AbstractClass {
	
	@Override
	public boolean hasName() {
		return this.getName() != null;
	}

}
