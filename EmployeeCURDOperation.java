package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeCURDOperation {
	
	List<Employee> empList=new ArrayList<Employee>();
	
	@GetMapping("/getEmployeeData")
	public void getEmployeeData(){
		 System.out.println(empList);
		
	}

	@PostMapping("/InsertData")
	public void InsertEmployeeData(@RequestBody  Employee emp){
	    empList.add(emp);
		System.out.println("data inserted successfully");
		
		
	}

	@PutMapping("/putdata")
	public void putEmployeeData(@RequestParam int empId ,@RequestBody Employee emp){
		
		
	}
    @DeleteMapping("/deleteData")
	public void deleteEmployeeData(@RequestParam int empId){
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
