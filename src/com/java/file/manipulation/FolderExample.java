package com.java.file.manipulation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FolderExample {

	public static void main(String[] args) {
		
		// File object representing a folder named "test-folder"
		File folder = new File("test-folder");
		
		if (folder.exists()) {
			
			System.out.println("The folder exists");
			
		} else {
			
			System.out.println("Created the directory: " + folder.mkdir());
			
		}
		
		// File object representing a file named "test.txt"
		File file = new File(folder, "test.txt");
		
		if (file.exists()) {
			
			System.out.println("File exists!");
			
		} else {
			
			try {
				
				System.out.println("File was created: " + file.createNewFile());
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		// FileWriter object to write to the file
		try {
			
			FileWriter stream = new FileWriter(file);
			PrintWriter writer = new PrintWriter(stream);
			
			writer.println("Line 1");
			writer.println("Line 2");
			writer.println("Line 3");
			
			writer.close();
			stream.close();
			
			
		} catch (IOException e) {
			
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		
		// FileReader object to read from the file
		try {
			
			FileReader stream = new FileReader(file);
			BufferedReader reader = new BufferedReader(stream);
			
			String nextLine = reader.readLine();
			
			while (nextLine != null) {
					
			System.out.println(nextLine);
			nextLine = reader.readLine();
					
			}
			
			reader.close();
			stream.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
			
		}

	}

}
