package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;
import com.springboot.repo.EmpRepository;

@RestController
public class EmpController {
	
	@Autowired
	private EmpRepository empRepository;
	@PostMapping("/save")
	public Employee saveEmp(@ModelAttribute Employee employee) {
		
		return empRepository.save(employee);
		}
		
	@RequestMapping("/displayAll")
	public List<Employee> displayAllEmp() {
		return empRepository.findAll();
	}
	@RequestMapping("/display/{employee_id}")
	public Employee displayEmp(@PathVariable int employee_id) {
		return empRepository.findById(employee_id).get();
	}

}
