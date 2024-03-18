package com.efinance.query.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dominio")
public class DomainController {

	@GetMapping("/list")
	public String getDomains() {
		
		return "domains";
	}
}
