package com.axebeak.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.axebeak.repositories.UserRepository;

public class UserService {

	@Autowired
	public UserRepository userRepo;
}
