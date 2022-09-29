package com.project1.project1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goals")
public class LearningGoals {
	
	@GetMapping
	public String Goals() 
	{
		return "<h2>Goals</h2>"
				+"Learning Goals:<ol><li>Study Java <li>Study MySQL</br></ol>";
				
				
	}
		
	
}
