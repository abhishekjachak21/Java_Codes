package com.example.array;

public class TwoDimensionalArray {
	
	
	
	public static void main(String[] args) {
		
		int arr[][]=new int[3][];
		
		arr[0]=new int [2];
		arr[1]=new int [1];
		arr[2]=new int [3];
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=i+j;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("printing the contents of the array using for each loop");
		
		for(int y[]:arr){
			for(int x:y) {
				System.out.print(x+"  ");
			}
			System.out.println();
		}

	}
}