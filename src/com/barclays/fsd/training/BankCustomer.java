package com.barclays.fsd.training;

// static - free access - class reference  				ifsc 
// non static - restricted access - object reference  	bal

public class BankCustomer {
	static String ifsc;
	double balance;

	static void m1() {
		System.out.println(BankCustomer.ifsc);
		BankCustomer obj = new BankCustomer();
		System.out.println(obj.balance);
	}

	void m2() {
		System.out.println(BankCustomer.ifsc);
		System.out.println(this.balance);
	}

}
