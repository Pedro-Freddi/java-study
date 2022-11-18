package com.java.general;

import java.util.Scanner;

public class ArraysTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float[] notas = new float[3];
		float average = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Input grade: ");
			notas[i] = sc.nextFloat();
			average += notas[i];
		}
		
		average /= notas.length;
		
		System.out.println("The average of the class is: " + average);
		
		sc.close();
		
		System.out.println("Finished...");
		
	}

}
