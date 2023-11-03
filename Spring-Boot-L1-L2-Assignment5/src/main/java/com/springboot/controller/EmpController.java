package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;
import com.springboot.service.EmpService;


@RestController
public class EmpController {
	@Autowired
	private EmpService empService;
	
	@PostMapping("/save")
	public Employee saveEmp(@RequestBody Employee employee) {
		
		return empService.save(employee);
		}
		
	@GetMapping("/displayAll")
	public List<Employee> displayAllEmp() {
		return empService.findAll();
	}
	@GetMapping("/display/{employee_id}")
	public Employee displayEmp(@PathVariable int employee_id) {
		return empService.findById(employee_id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id) {
		return empService.deleteById(id);
	}
	
	@PutMapping("/update")
public Employee updateEmp(@RequestBody Employee employee) {
		return empService.update(employee);
		}
	

}
