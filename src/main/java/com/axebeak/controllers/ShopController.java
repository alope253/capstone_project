package com.axebeak.controllers;


//add the song/album you want, add it to your cart

import com.axebeak.model.Product;
import com.axebeak.model.Users;
import com.axebeak.services.CartService;
import com.axebeak.services.ProductService;

//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
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
    
    //ModelAndView model=new ModelAndView("/shop-page.jsp");

    @RequestMapping(value = "/shop-page", method = RequestMethod.POST)
    public ModelAndView addSong(@RequestParam String song, @RequestParam String action, @RequestParam String album){
        //Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
        //Users user= (Users)authentication.getPrincipal();
        System.out.println("here");
        if(action.equals("Add-song-to-cart")) {
        	cartService.addProductToCart(0,productService.getProductByTitle(song));
        	ModelAndView model=new ModelAndView("shop-page","songList",getProductList());
        	model.addObject("albumList", getAlbumList());
        	System.out.println("add");
        	return model;
        }else if(action.equals("Add-album-to-cart")) {
        	cartService.addProductToCart(0,productService.getProductByTitle(song));
        	ModelAndView model=new ModelAndView("shop-page","songList",getProductList());
        	model.addObject("albumList", getAlbumList());
        	System.out.println("add");
        	return model;
        }else {
        	ModelAndView model=new ModelAndView("cart","cartList",cartService.getCart(0));
        	System.out.println("done");
        	return model;
        }
    }
    
    

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public String showCart() {
    	return"cart";
    }
 
    
    @RequestMapping(value = "/shop-page", method = RequestMethod.GET)
    public ModelAndView showAddedSong(){
    	System.out.println("shop-page get");
    	System.out.println(getProductList());
    	ModelAndView model= new ModelAndView("shop-page","songList",getProductList());
    	model.addObject("albumList", getAlbumList());
       // model.addObject( "songs",productService.songsToString());
        //model.addObject("productList", getProductList());
        //model.addObject("test", "test");

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

}
