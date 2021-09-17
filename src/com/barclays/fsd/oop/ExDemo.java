package com.barclays.fsd.oop;

public class ExDemo {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
