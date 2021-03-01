package com.axebeak.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int genre_id;
	
	public String genre;
	
	@OneToMany
	public Song songs;
	@OneToMany
	public Artist artists;
	@OneToMany
	public Album albums;
	
}
