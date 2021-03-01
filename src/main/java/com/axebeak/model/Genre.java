package com.axebeak.model;

import java.util.Set;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int genre_id;
	
	public String name;
	public String description;
	
	@ManyToMany
	public Set<Song> songs;
	@ManyToMany
	public Set<Artist> artists;
	@ManyToMany
	public Set<Album> albums;
	
}
