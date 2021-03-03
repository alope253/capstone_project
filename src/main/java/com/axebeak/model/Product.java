package com.axebeak.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	public int id;
	
	public String title;
	public double price;
	public Date release_date;
	public String description;
	public PRODUCTTYPE product_type;
	
	public enum PRODUCTTYPE {
		ALBUM,
		SONG
	}
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "product_genre", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
	public Set<Genre> genre = new HashSet<>();
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "product_order", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "order_id"))
	public Set<Orders> order = new HashSet<>();
	
	@ManyToOne
	public Artist artists;
	
}
