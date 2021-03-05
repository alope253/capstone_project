package com.axebeak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

	//add product page interaction
	@GetMapping("/admin")
	public String newProductForm(ModelMap model) {
	    return "admin";
	}
		
}
