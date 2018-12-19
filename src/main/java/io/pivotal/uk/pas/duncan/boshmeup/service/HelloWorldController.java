package io.pivotal.uk.pas.duncan.boshmeup.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(name="/")
	public String index() {
		return "Hello World!";
	}

}
