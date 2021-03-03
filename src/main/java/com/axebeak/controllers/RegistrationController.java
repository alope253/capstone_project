package com.axebeak.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import com.axebeak.model.Users;
import com.axebeak.services.UserService;


@Controller
public class RegistrationController {
	
	@Autowired
	UserService userService;

	@GetMapping("/Registration")
    public String signUpPage() {
        return "Registration.jsp";
    }

    @PostMapping("/Registration")
    public RedirectView postSignUpPage(Users user) {
        userService.addUser(user);
        return new RedirectView("login");
    }
	
}
