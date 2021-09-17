package com.barclays.fsd.oop;

interface BarclaysBank {
	void chackBanalce();
}

class BranchOne implements BarclaysBank {
	@Override
	public void chackBanalce() {
		System.out.println("one");
	}
	void m1() {
		System.out.println("m1");
	}
}

class BranchTwo implements BarclaysBank {
	@Override
	public void chackBanalce() {
		System.out.println("two");
	}
	void m2() {
		System.out.println("m2");
	}
}

public class Test {
	public static void main(String[] args) {
		BarclaysBank obj1 = new BranchOne();
		BarclaysBank obj2 = new BranchTwo();
		obj1.chackBanalce();
		obj2.chackBanalce();
		obj1 = obj2;
		obj1.chackBanalce();
		
		int num = 10;
		num = 11;
		// Is num 10 or int?
		
		
	}
}
