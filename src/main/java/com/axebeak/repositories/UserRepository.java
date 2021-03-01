package com.axebeak.repositories;

import org.springframework.data.repository.CrudRepository;

import com.axebeak.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
