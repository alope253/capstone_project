package com.axebeak.controllers;


//add the song/album you want, add it to your cart

import com.axebeak.model.Product;
import com.axebeak.model.Users;
import com.axebeak.services.CartService;
import com.axebeak.services.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class ShopController {

    @Autowired
    CartService cartService;

    @Autowired
    ProductService songService;
    
    ModelAndView model=new ModelAndView("/shop-page.jsp");

    @RequestMapping(value = "/shop-page.jsp", method = RequestMethod.POST)
    public ModelAndView addSong(@RequestParam Product p, @RequestParam String action){
        Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
        Users user= (Users)authentication.getPrincipal();
        System.out.println("here");
        if(action.equals("Add-to-cart")) {
        	cartService.addProductToCart(0, p); 
        	model.addObject("return-message", p );
        	model.addObject("test", "test");
        	model.addObject("productList", getProductList());
        	System.out.println("add");
        	return model;
        }else {
        	System.out.println("done");
        	return model;
        }
    }
/*
    @RequestMapping(value = "/list-products.jsp", method = RequestMethod.GET)
    public String showCart() {
    	return"/list-products.jsp";
    }
    */
    @RequestMapping(value = "/shop-page.jsp", method = RequestMethod.GET)
    public ModelAndView showAddedSong(){
    	System.out.println("shop-page get");
    	System.out.println(getProductList());
        model.addObject( "songs",songService.songsToString());
        model.addObject("productList", getProductList());
        model.addObject("test", "test");

        return model;
    }

    private List<String> getProductList(){
    	List<String> productList= new ArrayList<String>();
    	for(Product product:songService.getAllSongs()) {
    		productList.add(product.getTitle());
    	}
    	return productList;
    }

}
