package com.example.demo;

public class TestCurdOperations {

	public static void main(String[] args) {
		Employee emp= new Employee(101,"ABC");
		Employee emp1= new Employee(102,"qwert");
		EmployeeCURDOperation operation= new EmployeeCURDOperation();
		
		operation.InsertEmployeeData(emp);
		operation.getEmployeeData();
		operation.deleteEmployeeData(101);
		//operation.putEmployeeData();
		
	}

}
