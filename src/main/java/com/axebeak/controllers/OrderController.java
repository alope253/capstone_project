package com.axebeak.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.axebeak.model.Orders;
import com.axebeak.services.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/order-list", method=RequestMethod.GET)
	public String getOrdersList(ModelMap model) throws Exception {
		Iterable<Orders> us = orderService.findAll();
		model.put("orders", us);
		return "order-list";
	}
	
	@RequestMapping(value="/delete-order/{id}")
	public ModelAndView deleteOrders(ModelMap model, @PathVariable("id") Integer id) {
		Orders o = orderService.getOrderById(id);
		orderService.deleteOrder(o);
		model.put("deleted", o.getId());
		return new ModelAndView("redirect:/order-list", model); 
	}
    
    //edit order page interaction
    @GetMapping("/edit-order/{id}")
    public String updateTaskForm(ModelMap model, @PathVariable("id") Integer id) {
        Orders o = orderService.getOrderById(id);
        model.put("order", o);
        return "edit-order";
    }

    @PostMapping("/edit-order/{id}")
    public RedirectView updateTask(Principal principal, Orders u, @PathVariable("id") Integer id) {
    	orderService.updateOrder(u);
        return new RedirectView("/order-list");
    }
}