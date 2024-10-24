package com.example.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
	public static void main(String[] args) {
        Thread t1 = new Thread(()->{System.out.println("hello from "+Thread.currentThread().getName());});
        t1.start();
        
        Thread t2 = new Thread(()->{System.out.println("bello from "+Thread.currentThread().getName());});
        t2.start();
        
        Thread t3 = new Thread(()->{
        	for (int i = 0; i <= 10; i++) {
    			System.out.println("printing " + i + " from " + Thread.currentThread().getName());
    			try {
    				Thread.sleep(1000);
    			} catch (InterruptedException ex) {
    			}
    		}
        });
        
        t3.start();

	}
}
