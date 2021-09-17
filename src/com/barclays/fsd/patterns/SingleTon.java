package com.barclays.fsd.patterns;

class MyClass {
	int num;
	private static MyClass obj; // 2. create var

	private MyClass() { // 1. create private constructor
	}

	public static MyClass getInstance() { // 3. create getInstance();
		if (obj == null) {
			obj = new MyClass();
		}
		return obj;
	}

	void printNum() {
		System.out.println(this.num);
	}
}

public class SingleTon {
	public static void main(String[] args) {
		MyClass obj = MyClass.getInstance(); // 4.
		obj.num = 10;
		obj.printNum();
		MyClass obj2 = MyClass.getInstance();
		obj2.printNum();
		obj2.num = 11;
		obj.printNum();
		obj2.printNum();
	}
}