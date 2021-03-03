package com.axebeak.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.axebeak.model.Users;
import com.axebeak.repositories.UserRepository;


@Service
public class UserService {

	@Autowired
	public UserRepository userRepo;
	
	public Users addUser(Users user) {
        user.setPassword((user.getPassword()));
        return userRepo.save(user);
    }
	
}
