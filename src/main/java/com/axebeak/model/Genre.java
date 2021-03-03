package com.axebeak.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	public String name;
	public String description;
	
	@ManyToMany
	public Set<Product> products = new HashSet<>();
	
	@ManyToMany
	public Set<Artist> artists = new HashSet<>();
	
}
