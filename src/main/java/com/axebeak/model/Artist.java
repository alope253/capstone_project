package com.axebeak.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
public class Artist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	
	public String artist_name;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "artist_genre", joinColumns = @JoinColumn(name = "artist_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
	public Set<Genre> genre  = new HashSet<>();
	
	@OneToMany(mappedBy="artists")
	public Set<Product> products = new HashSet<>();
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Product))
            return false;
        Product other = (Product) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

	@Override
	public String toString() {
		return "Artist [id=" + id + ", artist_name=" + artist_name + "]";
	}
}
