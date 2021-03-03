package com.axebeak.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


import lombok.Data;

@Entity
@Data
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@ManyToOne
	public Users user;
	
	@ManyToMany
	public Set<Product> products = new HashSet<>();
	
	//This class will be removed in favor of Orders. 
	//Expanding the orderStatus enumerated type in the future will cover for Cart, Wishlist, and Orders
	
}
