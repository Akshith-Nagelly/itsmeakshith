package com.lti.polymorphism;

public class Seller1 extends Amazon {
	
	public Seller1() {
		super();
	}

	@Override
	void purchase(double price) {
		
		double totalPrice=price-price*amazonDiscount();
		System.out.println("amount to be paid" +totalPrice);

	}

}
