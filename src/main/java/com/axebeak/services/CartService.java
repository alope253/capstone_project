package com.axebeak.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.axebeak.repositories.CartRepository;

public class CartService {
	
	@Autowired
	CartRepository cartRepo;

}
