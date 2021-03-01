package com.axebeak.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int user_id;
	
	public String username;
	public String password;
	
	public String first_name;
	public String last_name;
	
	public String email;
	
	@OneToOne
	public Cart cart;
	
}
