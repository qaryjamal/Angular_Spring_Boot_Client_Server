package net.javaguides.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.model.Employee;
import net.javaguides.repository.EmployeeRepo;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	//get all 
	@GetMapping("employees")
	public List<Employee> getEmployees(){
		return this.employeeRepo.findAll(); 
	}
	
	
}
