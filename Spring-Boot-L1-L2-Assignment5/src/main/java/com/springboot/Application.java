package com.springboot;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.model.Employee;
import com.springboot.service.EmpService;

@SpringBootApplication
public class Application {

	@Autowired
	private EmpService empService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@PostConstruct
	public void initialize() {
		Employee e1=new Employee(1,"Sumit Sharma","sumit@gamil.com","Noida");
		Employee e2=new Employee(2,"Ankit Sharma","ankit@gamil.com","Pune");
		Employee e3=new Employee(3,"Deepa Sharma","deepa@gamil.com","Delhi");
		empService.empMap.put(e1.getEmployee_id(), e1);
		empService.empMap.put(e2.getEmployee_id(), e2);
		empService.empMap.put(e3.getEmployee_id(), e3);
	}

}
