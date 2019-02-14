package com.letsstartcoding.sprintbootrestapiexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.sprintbootrestapiexample.model.User;



@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	/*to save an employee*/
	
	public User save(User emp) {
		return employeeRepository.save(emp);
	}
	
	
	/* search all employees*/
	
	public List<User> findAll(){
		return employeeRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public User findOne(Long empid) {
		return employeeRepository.findOne(empid);
	}
	
	
	
	/*delete an employee*/
	
	public void delete(User emp) {
		employeeRepository.delete(emp);
	}
	

}
