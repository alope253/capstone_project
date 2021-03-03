package com.axebeak.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Artist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	public String artist_name;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "artist_genre", joinColumns = @JoinColumn(name = "artist_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
	public Set<Genre> genre  = new HashSet<>();
	
	@OneToMany
	public Set<Product> products = new HashSet<>();
}
