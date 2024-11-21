package com.automationbuilding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationBuildingController {
	
	@GetMapping(value = "/getValue")
	public String get() {
		return "Hello World";
	}

}
