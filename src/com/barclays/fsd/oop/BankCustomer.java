package com.barclays.fsd.oop;

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
