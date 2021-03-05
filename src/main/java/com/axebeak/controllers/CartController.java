package com.axebeak.controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.axebeak.model.Product;
import com.axebeak.services.CartService;
import com.axebeak.services.ProductService;

@Controller
public class CartController {
	
	@Autowired
	ProductService productService;

	@Autowired
	CartService cartService;
	
	
	
	  @RequestMapping(value = "/remove-product/{id}")
	    public ModelAndView adjustedCart(@PathVariable("id") Integer id) {
	    	ModelAndView model=new ModelAndView("redirect:/cart");
	    	
	    	return model;
	    }

    
	 @RequestMapping(value = "/cart", method = RequestMethod.GET)
	    public ModelAndView showCart() {
	    	Iterable<Product> products=productService.findAll();
	    	ModelAndView model = new ModelAndView("cart");
	    	model.addObject("yourCart",products);
	    	return model;
	    }
	 
	 
 
    
	
	
}
