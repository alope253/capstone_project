package com.axebeak.model;

import java.sql.Date;
import java.util.Set;
import javax.persistence.*;
import lombok.Data;


@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public String title;
	public double price;
	public Date release_date;
	public String description;
	
	@ManyToMany
	public Set<Genre> genre;
	
	@ManyToMany
	public Set<Cart> cart;
	
}
