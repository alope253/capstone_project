package com.axebeak.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Album {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int album_id;
	
	public String title;
	public Date release_date;
	public double price;
	
	@ManyToMany
	public Set<Artist> artists;
	@ManyToMany
	public Set<Genre> genre;
	@ManyToMany
	public Set<Song> songs;
	
	@ManyToMany
	public Set<Cart> carts;
	
}
