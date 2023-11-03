package com.springboot;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner init(ApplicationContext context) {
		return args-> {
			String[] beans=context.getBeanDefinitionNames();
			Arrays.sort(beans);
			for(String bean:beans) {
				System.out.println(bean);
			}
			
		};
		
	}

}
