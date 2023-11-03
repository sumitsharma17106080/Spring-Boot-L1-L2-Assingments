package com.springboot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Component;

import com.springboot.model.Employee;

@Component
public class EmpService {
	
	public static Map<Integer,Employee> empMap=new HashMap<>();

	public Employee save(Employee employee) {
		empMap.put(employee.getEmployee_id(), employee);
		return employee;
	}

	public List<Employee> findAll() {
		List<Employee> empList=new ArrayList<>();
		for(Entry<Integer, Employee> entry:empMap.entrySet()) {
			empList.add(entry.getValue());
		}
		return empList;
	}

	public Employee findById(int employee_id) {
		Employee e1=null;
		for(Entry<Integer, Employee> entry:empMap.entrySet()) {
			if(entry.getValue().getEmployee_id()==employee_id){
				e1=entry.getValue();
				break;
			}
		}
		return e1;
	}

	public String deleteById(int id) {
		boolean check=false;
		for(Entry<Integer, Employee> entry:empMap.entrySet()) {
			if(entry.getValue().getEmployee_id()==id){
				empMap.remove(entry.getKey());
				check=true;
				break;
			}
		}
		
		if(check)return "Delate SucessFully";
		return "Employe With "+id+" is not available";
	}

	public Employee update(Employee employee) {
		deleteById(employee.getEmployee_id());
		save(employee);
		return employee;
	}

}
