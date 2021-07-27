package com.lti.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begins");
		int[] num= {1,2,3};
		int[] num1= {10,20,30,40,50};
		
		try {
			System.out.println(num[0]);
			System.out.println(num1[1]);
			int n=10/0;
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("array is not initialized");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("position not found");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main ends");

	}

}
