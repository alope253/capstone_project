package com.axebeak.model;

import java.sql.Date;
import java.util.Set;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	public int product_id;
	
	public String title;
	public double price;
	public Date release_date;
	public String description;
	
	@ManyToMany
	public Set<Genre> genre;
	
	@ManyToMany
	public Set<Cart> cart;
	
	@ManyToMany
	public Set<Order> order;
	
}
