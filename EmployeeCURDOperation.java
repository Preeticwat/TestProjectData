package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class EmployeeCURDOperation {
	
	List<Employee> empList=new ArrayList<Employee>();
	
	public void getEmployeeData(){
		 System.out.println(empList);
		
	}

	public void InsertEmployeeData(Employee emp){
	    empList.add(emp);
		System.out.println("data inserted successfully");
		
		
	}

	public void putEmployeeData(int empId ){
		
		
	}

	public void deleteEmployeeData(int empId){
		int id= Optional.ofNullable(empId).get();
		Iterator itr= empList.iterator();
		while(itr.hasNext()){
			Employee emp= (Employee) itr.next();
			if(emp.getEmployeeId()== empId){
				itr.remove();
			}
			
		}
	
	}

}
