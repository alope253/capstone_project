package com.axebeak.controllers;


//add the song/album you want, add it to your cart

import com.axebeak.model.Product;
import com.axebeak.model.Users;
import com.axebeak.services.CartService;
import com.axebeak.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShopController {

    @Autowired
    CartService cartService;

    @Autowired
    ProductService songService;

    @RequestMapping(value = "/shop-page.jsp", method = RequestMethod.POST)
    public String addSong(ModelMap model, @RequestParam Product p, @RequestParam String action){
        Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
        Users user= (Users)authentication.getPrincipal();
        System.out.println("here");
        if(action.equals("Add-to-cart")) {
        	cartService.addProductToCart(0, p);
        	model.put("return-message", p );
        	model.put("test", "test");
        	System.out.println("add");
        	return"/shop-page.jsp";
        }else {
        	System.out.println("done");
        	return"/list-prodcuts.jsp";
        }
    }

    @RequestMapping(value = "/list-products.jsp", method = RequestMethod.GET)
    public String showCart() {
    	return"/list-prodcuts.jsp";
    }
    
    @RequestMapping(value = "/shop-page.jsp", method = RequestMethod.GET)
    public String showAddedSong(ModelMap model){
        model.put( "songs",songService.songsToString());
        model.put("productList", songService.getAllSongs());
        model.put("test", "test");

        return "/shop-page.jsp";
    }


}
