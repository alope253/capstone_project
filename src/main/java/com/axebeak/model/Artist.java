package com.axebeak.model;

import java.util.Set;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Artist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int artist_id;
	
	public String artist_name;
	
	@ManyToMany
	public Set<Genre> genre;
	@ManyToMany
	public Set<Album> albums;
	@OneToMany
	public Set<Song> songs;
}
