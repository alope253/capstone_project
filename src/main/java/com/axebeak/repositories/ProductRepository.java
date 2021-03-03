package com.axebeak.repositories;

import org.springframework.data.repository.CrudRepository;

import com.axebeak.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
