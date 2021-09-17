package com.barclays.fsd.patterns;

interface Bank {
	void service();
}

class Barclays implements Bank {
	@Override
	public void service() {
		System.out.println("Welcome to Barclays.");
	}
}

class Citi implements Bank {
	@Override
	public void service() {
		System.out.println("Welcome to Citi.");
	}
}

class HDFC implements Bank {
	@Override
	public void service() {
		System.out.println("Welcome to HDFC.");
	}
}

class BankFactory {
	public static Bank getInstance(String bankName) {
		if (bankName.equals("UK"))
			return new Barclays();
		if (bankName.equals("US"))
			return new Citi();
		if (bankName.equals("IN"))
			return new HDFC();
		return null;
	}
}

public class FactoryPattern {

	public static void main(String[] args) {
		Bank obj = BankFactory.getInstance("UK");
		Bank obj2 = BankFactory.getInstance("US");
		Bank obj3 = BankFactory.getInstance("IN");
		obj.service();
		obj2.service();
		obj3.service();
	}
}