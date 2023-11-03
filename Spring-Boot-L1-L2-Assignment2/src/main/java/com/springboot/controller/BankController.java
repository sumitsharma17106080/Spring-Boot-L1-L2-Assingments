package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BankController {
	
	@RequestMapping("/bank")
	public String bank() {
		return "redirect:/bank.html";
		
	}
	@RequestMapping("/address")
	public String bankAddress() {
		return "redirect:/service.html";
		
	}

}
