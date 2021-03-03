package com.axebeak.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	public OrderStatus order_status;
	
	public enum OrderStatus { 
		CART,
		WISHLIST,
		PLACED, 
		PROCESSING,
		OUTBOUND,
		DELIVERED 
	}
	
	@ManyToOne
	@JoinColumn(name="user_id")
	public Users user;
	
	@ManyToMany(mappedBy = "order")
	public Set<Product> products = new HashSet<>();
	
}
