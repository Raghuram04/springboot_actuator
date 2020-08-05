package com.weblearner.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;


@Component
public class CustomHealthChecker implements HealthIndicator{
	
	@Autowired
	private ActuatorController controller;

	@Override
	public Health health() {	
		System.out.println("Custom method is invoked");
		String resposne = controller.myService();
		System.out.println("Health check response"+ resposne);
		if(resposne.equalsIgnoreCase("Hello World")) {
			return Health.up().withDetail("status", "Service Works fine  !!!").build();
		}		
		return Health.down().withDetail("status", "Not Fully Ready !!!").build();
	}

}
