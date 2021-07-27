package com.lti.polymorphism;

public class Seller2 extends Amazon {
	public Seller2() {
		super();
	}

	@Override
	void purchase(double price) {
		double totalPrice = price - price * amazonDiscount()-seller2Discount();
		System.out.println("amount to be paid" + totalPrice);
	}

	private double seller2Discount() {
		return 0.02;
	}

}
