package com.barclays.fsd.oop;

/**
 * inheritance - code reusability 
 * encapsulation - bind data and code 
 * abstraction - minimum necessary representation 
 * polymorphism - same method works in different ways
 * 
 * @author Vaman
 *
 */

class Phone {
	void call() {

	}

	void sms() {

	}
}

class SmartPhone extends Phone {
	void music() {

	}

	void camera() {
		System.out.println("take photos");
	}

}

class OnePlus extends SmartPhone {

	@Override
	void camera() {
		System.out.println("take HD photos");
	}

}

public class App {

	public static void main(String[] args) {
		BankCustomer obj = new BankCustomer();
		obj.deposit(10000);

	}

}
