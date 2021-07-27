package com.lti.main;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.model.Account;
import com.lti.model.CurrentAccount;
import com.lti.model.SavingsAccount;
import com.lti.main.DispayAccount;

public class Main {

	public static void main(String[] args) {
		scenario6();

	}

	public static void scenario1() {
		Account account = new Account(12, 12000, "akshi");
		DispayAccount displayAccount = new DispayAccount();
		displayAccount.display(account);

	}

	public static void scenario2() {
		Account[] accounts = new Account[2];
		accounts[0] = new Account(13, 15000, "barfi");
		accounts[1] = new Account(14, 16000, "hyderabad");
		DispayAccount displayAccount = new DispayAccount();
		displayAccount.display9(accounts);

	}

	public static void scenario3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of students");
		int no0fAccounts = sc.nextInt();
		Account[] accounts = new Account[no0fAccounts];
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("enter account number,account balance,password");
			int accountNo = sc.nextInt();
			double accountBalance = sc.nextDouble();
			String accountPassword = sc.next();
			accounts[i] = new Account(accountNo, accountBalance, accountPassword);
		}
		DispayAccount displayAccount = new DispayAccount();
		displayAccount.display9(accounts);

	}

	public static void scenario4() {
		List<Account> accounts = new ArrayList<Account>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter the details");
			int accountNo = sc.nextInt();
			double accountBalance = sc.nextDouble();
			String accountPassword = sc.next();
			accounts.add(new Account(accountNo, accountBalance, accountPassword));
			System.out.println("Press 0 to stop?");
			int num = sc.nextInt();
			if (num == 0)
				break;

		} while (true);

		DispayAccount displayAccount = new DispayAccount();
		displayAccount.display(accounts);

	}

	public static void scenario5() {
		SavingsAccount accounts = new SavingsAccount(12, 12000, "akshi", 5000);
		DispayAccount displayAccount = new DispayAccount();
		displayAccount.display(accounts);

	}
	
	public static void scenario6() {
		CurrentAccount accounts = new CurrentAccount(12, 12000, "akshi", 115000);
		DispayAccount displayAccount = new DispayAccount();
		displayAccount.display(accounts);
	}
}
