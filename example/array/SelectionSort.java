package com.example.array;


public class SelectionSort {
	
	 public static int getMaxElementIndex(int arr[], int b) {
		 int index = 0;
		 int max = arr[0];
		 for(int i=1;i<b;i++) {
			 if(arr[i]>max) {
				 index = i;
				 max = arr[i];
			 }
		 }
		 return index;
	 }
	 
	 public static void swap(int arr[], int x, int y) {
		 int temp= arr[x];
		 arr[x] = arr[y];
		 arr[y] = temp;
	 }
	 
	 
	 
    public static void selectionSort(int[] arr) {
        
    	int n = arr.length;
    	
    	
        for (int i = n; i >=1 ; i--) {
            
        	int index = getMaxElementIndex(arr, i);
        	if(index != i-1) swap(arr, index,  i-1);
            
        }
    }

    public static void main(String[] args) {
    	
        int[] arr = {2,9,7,1,5,7,4,22,1};
        
        System.out.print("Original array ===> ");
        for (int x : arr)   System.out.print(x + " ");
        
        
        selectionSort(arr);
        
        System.out.print(" and Sorted array ==> ");
        for (int x : arr)  System.out.print(x + " ");
        
    }
}



/*
public class SelectionSort {
    public static void selectionSort(int[] array) {
        
    	int n = array.length;

        for (int i = 0; i < n-1 ; i++) {
            
        	int minIndex = i;

            for (int j = i+1; j < n ; j++) 
                if (array[j] < array[minIndex]) 
                    minIndex = j; 
            
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
            
        }
    }

    public static void main(String[] args) {
    	
        int[] array = {2,1,9,7,1,5,7,4,22,1};
        
        System.out.print("Original array ===> ");
        for (int x : array)   System.out.print(x + " ");
        
        
        selectionSort(array);
        
        System.out.print(" and Sorted array ==> ");
        for (int x : array)  System.out.print(x + " ");
        
    }
}
*/
