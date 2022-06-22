package com.generationg6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class IndexController {
	// http://localhost:8080/
	@RequestMapping("/home")
	public String home(Model model) {

		return "home.jsp";
	}
}
