package com.lti.main;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.lti.model.Account;
import com.lti.model.CurrentAccount;
import com.lti.model.SavingsAccount;
import com.lti.model.Student;

public class DispayAccount {
	
	public static void display(Account accounts) {

		System.out.println(accounts.getBankName() + " " + accounts.getAccountNo() + " " + accounts.getAccountBalance()
				+ " " + accounts.getAccountPassword());

	}

	public static void display9(Account[] accounts) {
		for (int i = 0; i < accounts.length; i++) {
			display(accounts[i]);
		}
	}

	public static void display(List<Account> accounts) {

		Iterator<Account> acts = accounts.iterator();
		while (acts.hasNext()) {
			Account at = acts.next();
			display(at);
		}

	}
	public static void display(SavingsAccount accounts) {
		accounts.display(accounts);
		
	}
	public static void display(CurrentAccount accounts) {
		accounts.display(accounts);
	}

}
