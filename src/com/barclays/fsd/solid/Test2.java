package com.barclays.fsd.solid;

interface RBI {
	void doKyc();
}

class BarclaysBank implements RBI {

	@Override
	public void doKyc() {
		System.out.println("Use aadhaar");
	}
}

class Citi implements RBI {

	@Override
	public void doKyc() {
		System.out.println("Use passport");
	}
}
public class Test2 {

	public static void main(String[] args) {
		RBI obj = new BarclaysBank();
		obj.doKyc();

		BarclaysBank obj2 = new BarclaysBank();
		obj2.doKyc();
		
		Citi obj3 = new Citi();
		obj3.doKyc();
	}

}
/**
 * but won't all the banks have diffrerent implementations of the methods . how
 * will it work if it takes them to rbi interface kyc when we're doing it for
 * barclays
 */