package com.axebeak.model;

import lombok.*;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Users {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	
	public String username;
	public String password;
	
	public String first_name;
	public String last_name;
	
	public String email;
	
	public UserRole role;
	
	public enum UserRole{
		ADMIN,
		USER
	}
	
	@OneToMany(mappedBy="user")
	public Set<Orders> orders  = new HashSet<>();
	
	
	//prevent cascading delete from nuking the database
	@PreRemove
	public void removeArtistFromRelations() {
		for (Orders o : orders) {
			o.setUser(null);
		}
		this.orders=null;
	}
	
}