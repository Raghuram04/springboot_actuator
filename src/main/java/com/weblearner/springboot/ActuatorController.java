package com.weblearner.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {
	
	@RequestMapping("myService")
	public String myService() {
		return "Hello World";
	}

}
