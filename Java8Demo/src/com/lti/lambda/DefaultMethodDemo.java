package com.lti.lambda;

interface Demo{
	
	void method1();
	default void method2() {
		System.out.println("this method is from i1");
	}
}

interface Demo2{
	default void method2() {
		System.out.println("this method is from i2");
}

public class DefaultMethodDemo {
	
	public static void main(String[] args) {
		
		
		
	}

}
}
