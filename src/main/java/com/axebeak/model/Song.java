package com.axebeak.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Song {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int song_id;
	
	public String title;
	public Date release_date;
	public float price;
	public String label;
	public String description;
	
	@ManyToMany
	public Set<Genre> genre;
	@ManyToOne
	public Artist artist;
	@ManyToMany
	public Set<Album> albums;
	
	@ManyToMany
	public Set<User> shoppers;

}
