package com.axebeak.model;

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
	public Genre genre;
	@ManyToMany
	public Album albums;
	@OneToMany
	public Song songs;
}
