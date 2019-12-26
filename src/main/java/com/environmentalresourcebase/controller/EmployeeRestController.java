package com.environmentalresourcebase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.environmentalresourcebase.exception.ResourceNotFoundException;
import com.environmentalresourcebase.model.Employee;
import com.environmentalresourcebase.repository.EmployeeRepository;

@RestController
public class EmployeeRestController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@RequestMapping(path="/employees", method=RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable("id") long id){
		return employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
	}

}
