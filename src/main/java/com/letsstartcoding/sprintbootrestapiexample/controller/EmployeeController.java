package com.letsstartcoding.sprintbootrestapiexample.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsstartcoding.sprintbootrestapiexample.model.User;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	/* to save an employee*/
	@PostMapping("/create")
	public User createEmployee(@RequestBody User emp) {
		return employeeDAO.save(emp);
	}
	
	/*get all employees*/
	@GetMapping("/users")
	public List<User> getAllEmployees(){
		return employeeDAO.findAll();
	}
	
	
	
	
	
	
	
	
	
	

}
