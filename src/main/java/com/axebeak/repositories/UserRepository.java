package com.axebeak.repositories;

import org.springframework.data.repository.CrudRepository;

import com.axebeak.model.Users;

public interface UserRepository extends CrudRepository<Users, Integer>{

}
