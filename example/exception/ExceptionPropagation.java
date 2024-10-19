package com.example.exception;

class A{
	int x;
}
public class ExceptionPropagation {
  
  public static void f2(A a1) {
       System.out.print(10/0);
  }
  
  public static void f1(A a1) {
      f2(null);
  }
  
  public static void main(String[] args) {
      try {
          A a1 = null;
          f1(a1);
      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.print(e.getMessage());
      }catch (NullPointerException e) {
          System.out.print(e.getMessage());
      }catch (Exception e) {
          System.out.print(e.getMessage());
      }
  }
}






//ArrayIndexOutOfBoundsException

//public class ExceptionPropagation {
//    
//    public static void f2(int arr[]) {
//        
//        for (int i = 0; i <= arr.length; i++) 
//            System.out.print(arr[i] + " ");
//    }
//    
//    public static void f1(int arr[]) {
//        f2(arr);
//    }
//    
//    public static void main(String[] args) {
//        try {
//            f1(new int[] {2, 4, 1, 5, 7});
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.print(e.getMessage());
//        }
//    }
//}
