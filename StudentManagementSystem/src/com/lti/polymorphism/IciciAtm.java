package com.lti.polymorphism;

public class IciciAtm implements ATM {
	
	private double balance=15000;
	private double amount;

	@Override
	public void withdraw(double amount) {
		
		this.amount=amount;
		System.out.println("Amount withdrawn from Icici:"+amount);

	}

	@Override
	public double checkBalance() {
		
		return balance=balance-amount;
	}

}
