package org.sample;

public class Company {

	public void comId() {
		System.out.println("com id is 345678");
	}
	
	public void comName() {
		System.out.println("com name is cts ");
	}
	
	public static void main(String[] args) {
	Company c=new Company();
	c.comId();
	c.comName();
	Employee e=new Employee();
	e.empId();
	e.empName();
	}
}
