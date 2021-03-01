package com.axebeak.repositories;

import org.springframework.data.repository.CrudRepository;

import com.axebeak.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {

}
