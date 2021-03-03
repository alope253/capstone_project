package com.axebeak.model;

import java.util.Set;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int order_id;
	
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
	public Users user;
	
	@ManyToMany
	public Set<Product> products;
	
}
