package com.axebeak.model;

import lombok.Data;

import java.util.Set;

import javax.persistence.*;

@Entity
@Data
public class Users {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int user_id;
	
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
	
	@OneToMany
	public Set<Orders> orders;
	
}
