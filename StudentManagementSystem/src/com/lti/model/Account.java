package com.lti.model;

import java.util.Iterator;
import java.util.List;

 public class  Account {
	
	
	private int accountNo;
	private double accountBalance;
	private String accountPassword;
	private static String bankName;
	
	static {
		bankName="HDFC";	
	}
	
	
	
	



	public Account(int accountNo, double accountBalance, String accountPassword) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
     public void display(Account accounts) {
    	 System.out.println(accounts.accountNo+" "+accounts.accountBalance+" "+accounts.accountPassword);
    	 
     }
     
	

	

}
