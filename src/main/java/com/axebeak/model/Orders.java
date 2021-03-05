package com.axebeak.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	public OrderStatus order_status;
	
	public enum OrderStatus { 
		CART,
		WISHLIST,
		PLACED, 
		PROCESSING,
		OUTBOUND,
		DELIVERED 
	}
	
	@ManyToOne
	@JoinColumn(name="user_id")
	public Users user;
	
	@ManyToMany(mappedBy = "order")
	public Set<Product> products = new HashSet<>();
	
	
	//prevent cascading delete from nuking database
	@PreRemove
	public void removeOrderFromRelations() {
		for (Product p : products) {
			p.getOrder().remove(this);
		}
		this.products=null;
		
		user.getOrders().remove(this);
		this.user=null;
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
		return "Orders [id=" + id + ", order_status=" + order_status + ", user=" + user + "]";
	}
	
}
