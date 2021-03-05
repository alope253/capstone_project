package com.axebeak.controllers;


import com.axebeak.model.Cart;
import com.axebeak.model.Orders;

//add the song/album you want, add it to your cart

import com.axebeak.model.Product;
import com.axebeak.model.Users;
import com.axebeak.services.CartService;
import com.axebeak.services.OrderService;
import com.axebeak.services.ProductService;
import com.axebeak.services.UserService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.ui.*;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {

    @Autowired
    CartService cartService;
    @Autowired
    ProductService productService;
    @Autowired
    UserService userService;
    @Autowired
    OrderService orderService;
    

    @RequestMapping(value = "/shop-page", method = RequestMethod.POST)
    public ModelAndView addSong(@RequestParam String song, @RequestParam String action, @RequestParam String album){
        Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
        String username= authentication.getName();
        getCartForUser(username);
        if(action.equals("Add-song-to-cart")) {
        	cartService.addProductToCart(0,productService.getProductById(Integer.parseInt(song)));
        	ModelAndView model=new ModelAndView("shop-page","songList",getProductList());
        	model.addObject("albumList", getAlbumList());
        	model.addObject("addedItem", song);
        	return model;
        }else if(action.equals("Add-album-to-cart")) {
        	cartService.addProductToCart(0,productService.getProductById(Integer.parseInt(album)));
        	ModelAndView model=new ModelAndView("shop-page","songList",getProductList());
        	model.addObject("albumList", getAlbumList());
        	model.addObject("addedItem", album);
        	return model;
        }else {
        	ModelAndView model=new ModelAndView("cart");
        	System.out.println("done");
        	return model;
        }
    }
    
    
    @RequestMapping(value = "/shop-page", method = RequestMethod.GET)
    public ModelAndView showAddedSong(){
    	System.out.println("shop-page get");
    	System.out.println(getProductList());
    	ModelAndView model= new ModelAndView("shop-page","songList",getProductList());
    	model.addObject("albumList", getAlbumList());

        return model;
    }

    
    private Map<String,String> getProductList(){
    	Map<String,String> productList= new HashMap<String,String>();
    	for(Product product:productService.getAllSongs()) {
    		productList.put(Integer.toString(product.getId()),product.getTitle());
    	}
    	return productList;
    }

    
    private Map<String,String> getAlbumList(){
        Map<String,String> productList= new HashMap<String,String>();
        for(Product product:productService.getAllAlbums()) {
            productList.put(Integer.toString(product.getId()),product.getTitle());
        }
        return productList;
    }
    
    private Cart createCart() {
    	Cart cart=new Cart();
    	cart.setProducts(null);
    	cart.setUser(userService.getUserById(0));
    	return cart;
    }
    
    private Orders getCartForUser(String username) {
    	Users currentUser=userService.getUserByUserName(username);
    	Orders currentOrder=null;
    	int userId=currentUser.getId();
    	for(Orders order:orderService.findAll()) {
    		if((order.getUser().equals(currentUser))&&(order.getOrder_status().equals("CART"))) {
    			currentOrder=order;
    		}
    	}
    	return currentOrder;
    }
    

}
