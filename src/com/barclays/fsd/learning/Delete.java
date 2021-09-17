package com.barclays.fsd.learning;

public class Delete {
	public static int num1 = 10;
	protected static int num2 = 20;
	static int num3 = 30; // package - default 
	private static int num4 = 40;
	
	public static void main(String[] args) {
		System.out.println(Delete.num1);
		System.out.println(Delete.num2);
		System.out.println(Delete.num3);
		System.out.println(Delete.num4);
	}
}
