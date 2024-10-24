package com.example.exception;
import java.io.*;
import java.util.Scanner;

public class CheckedExceptions {
	
	public static void readFile()  throws FileNotFoundException , IOException {
		FileWriter Writer
        = new FileWriter("C:\\Users\\myfile.txt");
    Writer.write(
        "Files in Java are seriously good!!");
    Writer.close();
    System.out.println("Successfully written.");
	}
	
	public static void main(String[] args) {
		try {
		  readFile();
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
