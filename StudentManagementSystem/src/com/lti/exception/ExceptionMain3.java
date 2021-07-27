package com.lti.exception;

import java.util.Scanner;

public class ExceptionMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begins");
		int[] num= {1,2,3};
		int[] num1= {10,20,30,40,50};
		
		try {
			System.out.println(num[0]);
			System.out.println(num1[1]);
			int n=10/1;
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("array is not initialized");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("position not found");
		}
		
		finally {
			System.out.println("finally executed");
		}
		// custom Exception
		int age=0;
		System.out.println("enter your age:");
		age=new Scanner(System.in).nextInt();
		if(age<0) {
			try {
				throw new NegativeAgeException("age cannot be negative");
			}
			catch(NegativeAgeException e) {
				System.out.println(e.getMessage());
			}
			
		}
		else {
			System.out.println("your age"+age+"years old");
		}
		
		System.out.println("main ends");

	}

}
