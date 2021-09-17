package com.barclays.fsd.patterns;

import java.util.ArrayList;
import java.util.List;

class Employee implements Cloneable {

	private List<String> empList;

	public Employee() {
		empList = new ArrayList<>();
	}

	public Employee(List<String> list) {
		this.empList = list;
	}

	public List<String> getEmpList() {
		return empList;
	}

	public void loadData() {
		// data comes from DB
		empList.add("Sonu");
		empList.add("Monu");
		empList.add("Tonu");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new Employee(temp);
	}

}

public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee emp = new Employee();
		emp.loadData();
		System.out.println(emp.getEmpList());

		Employee emp2 = (Employee) emp.clone();
		List<String> list = emp2.getEmpList();
		list.add("Gonu");
		System.out.println(emp2.getEmpList());

		String s1 = "abc";
		String s2 = "abc";
		s2 = null;
		s1 = null;

	}
}