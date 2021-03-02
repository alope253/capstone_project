package com.axebeak.model;

import java.sql.Date;
import java.util.Set;
import javax.persistence.*;
import lombok.*;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Song extends Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int song_id;
	
	public String title;
	public Date release_date;
	public double price;
	public String description;
	
	@ManyToMany
	public Set<Genre> genre;
	@ManyToOne
	public Artist artist;
	@ManyToMany
	public Set<Album> albums;
	
	@ManyToMany
	public Set<Cart> carts;

}
