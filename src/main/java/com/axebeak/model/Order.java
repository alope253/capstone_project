package com.axebeak.model;

import java.util.Set;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int order_id;
	
	public enum status { RECEIVED, PROCESSING, DELIVERED }
	
	@ManyToOne
	public User user;
	@ManyToMany
	public Set<Product> products;

	
}
