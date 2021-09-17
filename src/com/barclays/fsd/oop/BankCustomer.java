package com.barclays.fsd.oop;

// a comment 

public class BankCustomer {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	void deposit(double amount) {
		setBalance(getBalance() + amount);
	}

	void withdraw(double amount) {
		setBalance(getBalance() - amount);
	}

}
