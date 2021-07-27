package com.lti.model;

public class CurrentAccount extends Account {
	private int overdraftLimitAmount;

	

	public CurrentAccount(int accountNo, double accountBalance, String accountPassword,int overdraftLimitAmount) {
		super(accountNo, accountBalance, accountPassword);
		
		this.overdraftLimitAmount = overdraftLimitAmount;
	}

	public int getOverdraftLimitAmount() {
		return overdraftLimitAmount;
	}

	public void setOverdraftLimitAmount(int overdraftLimitAmount) {
		this.overdraftLimitAmount = overdraftLimitAmount;
	}

	@Override
	public int getAccountNo() {
		// TODO Auto-generated method stub
		return super.getAccountNo();
	}

	@Override
	public void setAccountNo(int accountNo) {
		// TODO Auto-generated method stub
		super.setAccountNo(accountNo);
	}

	@Override
	public double getAccountBalance() {
		// TODO Auto-generated method stub
		return super.getAccountBalance();
	}

	@Override
	public void setAccountBalance(double accountBalance) {
		// TODO Auto-generated method stub
		super.setAccountBalance(accountBalance);
	}

	@Override
	public String getAccountPassword() {
		// TODO Auto-generated method stub
		return super.getAccountPassword();
	}

	@Override
	public void setAccountPassword(String accountPassword) {
		// TODO Auto-generated method stub
		super.setAccountPassword(accountPassword);
	}

	@Override
	public void display(Account accounts) {
		// TODO Auto-generated method stub
		super.display(accounts);
		System.out.println(this.overdraftLimitAmount);
	}
	
     
	

}
