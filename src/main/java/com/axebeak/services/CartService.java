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

	public void deleteCart(Cart cart) {
		cartRepo.delete(cart);
	}
	
	public Cart addProduct(Cart cart) {
        return cartRepo.save(cart);
	}
	
	
	public Cart addProductToCart(int cart_id, Product p){
		if(cartRepo.findById(cart_id).isPresent()) {
			Cart cart=cartRepo.findById(cart_id).get();
			Set<Product> currentProducts=cart.getProducts();
			currentProducts.add(p);
			cart.setProducts(currentProducts);
			return cart;
		}
		return null;
	}
	
	public Cart getCart(int cart_id) {
		if(cartRepo.findById(cart_id).isPresent()) {
			return cartRepo.findById(cart_id).get();
		}
		return null;
	}
	
	public Set<Product> getCartContents(int cart_id){
		if(cartRepo.findById(cart_id).isPresent()) {
			return cartRepo.findById(cart_id).get().getProducts();
		}
		return null;
	}

}
