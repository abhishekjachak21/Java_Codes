package com.example.exception;

import java.io.*;

public class CheckedException extends Exception {
	
	public static void readFile() throws FileNotFoundException, IOException{
		FileWriter Writer = new FileWriter("C:\\Users\\myFile.txt");
		Writer.write("files in java is seriously good");
		Writer.close();
		System.out.println("Successfully written");
		
	}

	public static void main(String[] args) {
	   try {
		   readFile();
	   } catch(FileNotFoundException e) {
		   System.out.print(e.getMessage());
	   } catch(IOException e) {
		   System.out.print(e.getMessage());
	   }
	}

}
