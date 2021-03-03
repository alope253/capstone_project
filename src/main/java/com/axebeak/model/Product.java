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
	
	@ManyToMany
	public Set<Genre> genre = new HashSet<>();
	
	@ManyToMany
	public Set<Orders> order = new HashSet<>();
	
	@ManyToOne
	public Artist artists;
	
}
