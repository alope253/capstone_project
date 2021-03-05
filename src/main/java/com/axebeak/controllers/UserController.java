package com.axebeak.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.axebeak.model.Users;
import com.axebeak.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user-list", method=RequestMethod.GET)
	public String getUsersList(ModelMap model) throws Exception {
		Iterable<Users> us = userService.findAll();
		model.put("users", us);
		return "user-list";
	}
	
	@RequestMapping(value="/delete-user/{id}")
	public ModelAndView deleteUsers(ModelMap model, @PathVariable("id") Integer id) {
		Users p = userService.getUserById(id);
		userService.deleteUser(p);
		model.put("deleted", p.getUsername());
		return new ModelAndView("redirect:/user-list", model); 
	}
	
	//add user page interaction
	@GetMapping("/add-user")
    public String newUsersForm(ModelMap model) {
        return "add-user";
    }

    @PostMapping("/add-user")
    public RedirectView createNewUsers(ModelMap model, Principal principal, Users u) {
        userService.addUser(u);
        return new RedirectView("user-list");
    }
    
    //edit user page interaction
    @GetMapping("/edit-user/{id}")
    public String updateTaskForm(ModelMap model, @PathVariable("id") Integer id) {
        Users u = userService.getUserById(id);
        model.put("user", u);
        return "edit-user";
    }

    @PostMapping("/edit-user/{id}")
    public RedirectView updateTask(Principal principal, Users u, @PathVariable("id") Integer id) {
    	userService.updateUser(u);
        return new RedirectView("/user-list");
    }
}