package com.axebeak.model;

import java.util.Set;
import javax.persistence.*;
import lombok.*;

@Entity
@Data
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class Song extends Product {
	
	@ManyToOne
	public Artist artist;
	
	@ManyToMany
	public Set<Album> albums;
	
}
