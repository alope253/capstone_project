package com.axebeak.model;

import java.util.Set;
import javax.persistence.*;
import lombok.*;

@Entity
@Data
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class Album extends Product {
	
	@ManyToMany
	public Set<Artist> artists;

	@ManyToMany
	public Set<Song> songs;
	
}
