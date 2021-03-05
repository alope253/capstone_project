package com.axebeak.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	
	public String name;
	public String description;
	
	@ManyToMany(mappedBy="genre")
	public Set<Product> products = new HashSet<>();
	
	@ManyToMany(mappedBy="genre")
	public Set<Artist> artists = new HashSet<>();
	
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
		return "Genre [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
}
