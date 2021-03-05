package com.axebeak.repositories;

import org.springframework.data.repository.CrudRepository;
import com.axebeak.model.Orders;

public interface OrderRepository extends CrudRepository<Orders, Integer>{

}
