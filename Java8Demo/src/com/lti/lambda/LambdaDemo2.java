package com.lti.lambda;

//interface ISum{
	//int sum(int num1,int num2);
//}
interface ISum<T>{
	T sum(T num1,T num2);
}
interface ISquare{
	void area(double side);
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		//ISum add=(int num1,int num2)->{
			
		//	int sum= num1+num2;
			//return sum;
			
	//	};
	//	ISum add=(int num1,int num2)->{
			
				
		//	return num1+num2;
		//};
		
		//System.out.println("sum="+ add.sum(10,20));
		
		ISquare ak=(double side)->System.out.println("area:"+(side*side));
		ak.area(2);
		
		ISum<Integer> sumInteger=(num1,num2)->(num1+num2);
		System.out.println("sum="+sumInteger.sum(30,40));
		
		ISum<Double> sumDouble=(num1,num2)->(num1+num2);
		System.out.println("sum="+sumDouble.sum(1.2, 1.8));
		
		
	}

}
