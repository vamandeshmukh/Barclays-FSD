package com.barclays.fsd.oop;

public class Customer {

	private int eid;
	private String name;
	private double amount;

	// boilerplate code

	public Customer() {

	}

	public Customer(int eid, String name, double amount) {
		super();
		this.eid = eid;
		this.name = name;
		this.amount = amount;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Customer [eid=" + eid + ", name=" + name + ", amount=" + amount + "]";
	}

}
