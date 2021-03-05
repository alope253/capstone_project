package com.axebeak.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	public Integer id;
	
	public String title;
	public double price;
	public Date release_date;
	public String description;
	public PRODUCTTYPE product_type;
	
	public enum PRODUCTTYPE {
		ALBUM,
		SONG
	}
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
	@JoinTable(name = "product_genre", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
	public Set<Genre> genre = new HashSet<>();
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
	@JoinTable(name = "product_order", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "order_id"))
	public Set<Orders> order = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name="artist_id")
	public Artist artists;
	
	//prevent cascading delete from nuking the database
	@PreRemove
	public void removeArtistFromRelations() {
		for (Genre g : genre) {
			g.getProducts().remove(this);
		}
		this.genre=null;
		
		for (Orders o : order) {
			o.getProducts().remove(this);
		}
		this.order=null;
		
		artists.getProducts().remove(this);
		artists = null;
	}
	
	
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
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", release_date=" + release_date
				+ ", description=" + description + ", product_type=" + product_type + ", artists=" + artists + "]";
	}

}
