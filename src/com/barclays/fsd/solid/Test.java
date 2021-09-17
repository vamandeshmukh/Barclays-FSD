package com.barclays.fsd.solid;

interface RetailRBI {

	void doKyc(); // retail customers

}

interface CorporateRBI {

	void validateCompany(); // companies

}

class SBI implements RetailRBI {

	@Override
	public void doKyc() {
		// TODO Auto-generated method stub
	}
}

class Barclays implements CorporateRBI {

	@Override
	public void validateCompany() {
		// TODO Auto-generated method stub
	}
}

public class Test {

}
