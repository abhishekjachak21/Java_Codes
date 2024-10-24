package com.example.array;

public class ArrayMaster {
	
	public static int getMaxElementIndex(int arr[] , int b) {
		int index=0;
		int max=arr[0];
		for(int i=1;i<b;i++) {
			if(arr[i]>max) {
				index=i;
				max=arr[i];
			}
		}
		return index;
		
	}
	
	public static void swap(int arr[] , int x , int y) {
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	public static void selectionSort(int arr[]) {
		for(int i=arr.length;i>=1;i--) {
			int index=getMaxElementIndex(arr, i);
			if(index!=i-1)
				swap(arr , index , i-1);
		}
		
	}
	
	
	
  public static int max(int a , int b) {
	  return a>b?a:b;
  }	
  //find the maximum element of the array
  public static int getMax(int arr[]) {
	  int val=arr[0];
	  for(int x:arr) {
	    val=max(val,x);
	  }
	  return val;
  }	
	
  public static void main(String[] args) {
	int arr[]= {2,11,3,16,5,7 , 15 , 9, 8, 10};
	
	selectionSort(arr);
	//printing the contents using for each loop
	for(int x:arr) {
		System.out.print(x+"  ");
	}
	
	
}
}
