package com.axebeak.model;

import java.util.Set;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int cart_id;
	
	@OneToOne
	public User user;
	
	@ManyToMany
	public Set<Product> products;

}
