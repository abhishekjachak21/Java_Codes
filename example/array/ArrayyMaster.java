package com.examples.array;

public class ArrayyMaster {
	
	//find the max ele of array
	public static int getMax(int arr[]) {
		
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) max=arr[i];
		}
		System.out.println("Max ele => "+max);
		
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int arr[]= {2,9,7,1,5};
		
//		for(int i=0;i<arr.length;i++) arr[i]=i*i;
		
//		for(int i=0;i<arr.length;i++) System.out.println("arr["+i+"]="+arr[i]);
		
		for(int x:arr) System.out.println("arr => "+x);
		
		int maxima = getMax(arr);
		
//		System.out.println(maxima);
		
	}

}
