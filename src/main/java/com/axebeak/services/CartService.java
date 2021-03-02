package com.axebeak.services;

import com.axebeak.model.Cart;
import com.axebeak.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.axebeak.repositories.CartRepository;
import java.util.Set;

@Service
public class CartService {
	
	@Autowired
	CartRepository cartRepo;

	public Cart addSongToCart(int cart_id, Song song){
		if(cartRepo.findById(cart_id).isPresent()) {

			return cartRepo.findById(cart_id).get();
		}else{ return null;}
	}

}
