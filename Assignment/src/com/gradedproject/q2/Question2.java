package com.gradedproject.q2;

import java.util.Scanner;

public class Question2 {
	static double power(double x, int n) { // void cant be used because we cant use return, used power that hold two parameters.
        if (n == 0) {
            return 1;   // any value of power 0 is 1
        } else if (n > 0) {
            return x * power(x, n - 1);  // repeatedly to find the value of  x^(n-1)
        } else {
            return 1 / (x * power(x, -n));  // to hold -ve values
        }
        }
	 
	 public static void main(String [] args) { 
	 try (Scanner scan = new Scanner(System.in)) {
		System.out.println("Enter the Value of X : ");  
		float x=scan.nextFloat();   // to get value of x 
		System.out.println("Enter the Value of n : ");
		int n=scan.nextInt();   // to get value of n
	
		double ans=power(x,n);  // used power because to hold recursion in various cases.
		System.out.println("The value X^n is : " +ans); // printing the output 
	}
	}

}
