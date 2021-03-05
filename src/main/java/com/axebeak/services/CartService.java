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
			
			Cart cart=cartRepo.findById(cart_id).get();
			Set<Product> products=cart.getProducts();products.add(p);
			cart.setProducts(products);
			return cart;
		}
		return null;
	}

}
