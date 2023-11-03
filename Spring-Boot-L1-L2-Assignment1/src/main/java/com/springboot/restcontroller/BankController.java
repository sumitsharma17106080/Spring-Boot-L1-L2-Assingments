package com.springboot.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BankController {
	
	@RequestMapping("/bank")
	public String bank() {
		return "State Bank Of India";
		
	}
	@RequestMapping("/address")
	public String bankAddress() {
		return "Commercial Branch, 74, Janpath, IST FLR, New Delhi, Delhi 110001 · ~3.4 km";
		
	}

}
