package com.lti.lambda;

import java.util.Scanner;

interface AddCalc{
	void sum(int num1,int num2);
}


/*class AddCalciImpl implements AddCalc{

	@Override
	public void sum(int num1, int num2) {
		System.out.println("sum:"+ (num1+num2));
		
	}
	
}*/

interface Shape{
	void area();
}

public class LambdaDemo {

	public static void main(String[] args) {
		
		//AddCalc add=new AddCalciImpl();
		//add.sum(15, 10);
		//lambda
	//	AddCalc addCalc=(int num1,int num2)->{
			
	//	System.out.println("sum="+(num1+num2));
		

	//};
     //addCalc.sum(10,20);
		
		// lambda for circle
		Shape circle=()->{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter radius");
			double radius=sc.nextDouble();
			System.out.println("area of circle:"+(3.14*radius*radius));
		};
		circle.area();
		
		//lambda for rectangle
		
		Shape rectangle=()->{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter length:");
			double length=sc.nextDouble();
			System.out.println("enter breadth");
			double breadth=sc.nextDouble();
			System.out.println("area of rectangle:"+(length*breadth));
		};
		rectangle.area();
}
}
