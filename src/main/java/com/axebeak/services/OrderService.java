package com.axebeak.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.axebeak.model.Orders;
import com.axebeak.repositories.OrderRepository;

@Transactional
@Service
public class OrderService {

	@Autowired
	public OrderRepository orderRepo;
	
	public Iterable<Orders> findAll(){
		return orderRepo.findAll();
	}

	public Orders getOrderById(Integer id) {
		return orderRepo.findById(id).get();
	}
	
	public void deleteOrder(Orders p) {
		orderRepo.delete(p);
	}

	public void updateOrder(Orders p) {
		orderRepo.save(p);
	}
}
