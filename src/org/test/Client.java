package org.test;

import org.sample.Company;
import org.sample.Employee;

public class Client {

	public void cliId() {
		System.out.println("cli id is 456789");
	}
	
	public void cliName() {
		System.out.println("cli name is air canada");
	}
	
	public static void main(String[] args) {
		Client ci=new Client();
		ci.cliId();
		ci.cliName();
		Company c=new Company();
		c.comId();
		c.comName();
		Employee e=new Employee();
		e.empId();
		e.empName();
	}
}
