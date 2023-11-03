package com.springboot;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.model.Employee;
import com.springboot.repo.EmpRepository;

@SpringBootApplication
public class Application {
	@Autowired
	private EmpRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
	public void initialize() {
		Employee e1=new Employee(1,"Sumit Sharma","sumit@gmail.com","Noida");
		Employee e2=new Employee(2,"Ankit Sharma","ankit@gmail.com","Pune");
		Employee e3=new Employee(3,"Deepa Sharma","deepa@gmail.com","Delhi");
		List<Employee> eList=List.of(e1,e2,e3);
		empRepository.saveAll(eList);
		
	}

}
