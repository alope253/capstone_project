package com.axebeak.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Album {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int album_id;
	
	public String title;
	
	@ManyToMany
	public Artist artists;
	@ManyToOne
	public Genre genre;
	@ManyToMany
	public Song songs;
	
}
