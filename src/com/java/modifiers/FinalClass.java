package com.java.modifiers;

//A final class can't be extended by another class
public final class FinalClass extends AbstractClass {
	
	// A final attribute/field can't have its value changed
	// It's a convention to name a final field with uppercase letters
	// and underline to space the words
	public final int SECRET_NUMBER = 42;
	
	// A final method can't be overwritten in a subclass
	public final boolean canOverwrite() {
		return false;
	} 
	
	@Override
	public boolean hasName() {
		return this.getName() != null;
	}
	
}

