package com.java.file.manipulation;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		
		System.out.println("=== BEGIN ===");
		
		try {
			
			FileWriter stream = new FileWriter("./test.txt");
			PrintWriter writer = new PrintWriter(stream);
			
			writer.println("Line 1");
			writer.println("Line 2");
			
			writer.close();
			stream.close();
			
		} catch (IOException e) {
			
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
			
		} finally {
			
			System.out.println("=== END ===");
			
		}

	}

}
