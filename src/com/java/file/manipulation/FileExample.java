package com.java.file.manipulation;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		System.out.println("File exists: " + file.exists());
		System.out.println("Is a directory: " + file.isDirectory());
		System.out.println("Is a file: " + file.isFile());
		System.out.println("Can read the file: " + file.canRead());
		System.out.println("Can write to the file: " + file.canWrite());
		System.out.println("File size is: " + file.length() + " bytes");
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Relative path: " + file.getPath());
		
		if (!file.exists()) {
			
			try {
				
				System.out.println("File created: " + file.createNewFile());
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}

}
