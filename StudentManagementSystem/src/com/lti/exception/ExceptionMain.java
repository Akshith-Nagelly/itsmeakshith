package com.lti.exception;

import java.util.Scanner;

public class ExceptionMain {
	static int res=0,value=0;
	static int[]arr=new int[] {10,20,30,40,50};
	public static void main(String[] args) {
		
		int num1,num2,pos;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("main begins");
		System.out.println("enter two numers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println(divide(num1,num2));
		System.out.println("enter the position");
		pos=sc.nextInt();
		System.out.println(getElement(pos));
		
		System.out.println("main ends");

	}
	
	public static int divide(int num1,int num2) {
		try {
		res=num1/num2;
		}
		//catch(ArithmeticException e) {
		catch(Exception e) {
			//System.out.println("cannot divide by zero");
			System.out.println(e.getMessage());
		}
		
		return res;
	}
	
	public static int getElement(int index) {
		 
		try {
		return arr[index];
		}
		catch(Exception e) {
			System.out.println("position not found");
		}
		return value;
	}

}
