package com.axebeak.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.axebeak.model.Users;
import com.axebeak.repositories.UserRepository;

@Transactional
@Service
public class UserService {

	@Autowired
	public UserRepository userRepo;
	
	public Users addUser(Users user) {
        user.setPassword((user.getPassword()));
        return userRepo.save(user);
    }
	
	public Iterable<Users> findAll(){
		return userRepo.findAll();
	}

	public Users getUserById(Integer id) {
		return userRepo.findById(id).get();
	}
	
	public void deleteUser(Users p) {
		userRepo.delete(p);
	}

	public void updateUser(Users p) {
		userRepo.save(p);
	}
}
