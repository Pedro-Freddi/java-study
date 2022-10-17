package com.java.file.manipulation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		
		System.out.println("=== BEGIN ===");
		
		try {
			
			FileReader stream = new FileReader("./test.txt");
			BufferedReader reader = new BufferedReader(stream);
			
			String nextLine = reader.readLine();
			
			while (nextLine != null) {
				
				System.out.println(nextLine);
				nextLine = reader.readLine();
				
			}
			
			reader.close();
			stream.close();
			
		} catch (FileNotFoundException e) {
			
			System.err.println("File not found!");
			
		} catch (IOException e) {
			
			System.err.println("Something went wrong: " + e.getMessage());
			
		} finally {
			
			System.out.println("=== END ===");
			
		}

	}

}
