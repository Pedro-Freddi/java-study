package com.java.general;

public class Arrays {
	public static void main(String[] args) {
		
		// Arrays of primitive types
		byte[] arrayOfBytes = new byte[10];
		short[] arrayOfShorts = new short[10];
		int[] arrayOfInts = new int[10];
		long[] arrayOfLongs = new long[10];
		float[] arrayOfFloats = new float[10];
		double[] arrayOfDoubles = new double[10];
		char[] arrayOfChars = new char[10];
		boolean[] arrayOfBooleans = new boolean[10];
		
		// Arrays of objects
		String[] arrayOfStrings = new String[10];
		Object[] arrayOfObjects = new Object[10];
		Robot[] arrayOfRobots = new Robot[5];
		
		// Attribute a value to an index of an array
		arrayOfStrings[5] = "Hello";
		arrayOfChars[2] = 'H';
		arrayOfBooleans[8] = true;
		arrayOfFloats[9] = 25.99f;
		arrayOfDoubles[1] = 16.80d;
		arrayOfLongs[0] = 50;
		arrayOfRobots[2] = new Robot();
		arrayOfRobots[4] = new Robot("Megatron 3000", 1499.99);
		
		// Declare and attribute values to an array
		int[] anotherArrayOfInts = {30, 54, 25, 85, 10};
		int[] yetAnotherArrayOfInts = new int[] {30, 54, 25, 85, 10};
		
		// Iteration over an array with for-each
		for (Robot robot : arrayOfRobots) {
			if (robot instanceof Robot) {
				System.out.println(robot.getModel());
				System.out.println(robot.getPrice());
			} else {
				System.out.println("Invalid robot");
			}
		}
	
	}
}
