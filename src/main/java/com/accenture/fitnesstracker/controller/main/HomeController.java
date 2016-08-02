package com.accenture.fitnesstracker.controller.main;


import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private static final Logger LOGGER = Logger.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String homePage(){
		LOGGER.debug("root called");
		return "index";
	}
	
	

	@RequestMapping("/next")
	public String nextPage(){
		LOGGER.debug("next called");
		return "next";
	}
	
}
