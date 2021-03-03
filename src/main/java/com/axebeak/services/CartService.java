package com.axebeak.services;

import com.axebeak.model.Cart;
import com.axebeak.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.axebeak.repositories.CartRepository;
import java.util.Set;

@Service
public class CartService {
	
	@Autowired
	CartRepository cartRepo;

	public Cart addProductToCart(int cart_id, Product p){
		if(cartRepo.findById(cart_id).isPresent()) {

			return cartRepo.findById(cart_id).get();
		}else{ return null;}
	}

}
