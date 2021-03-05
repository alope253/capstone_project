package com.axebeak.services;

import com.axebeak.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axebeak.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired 
	ProductRepository productRepo;


	//returns entire database of songs
	public Iterable<Product> getAllSongs(){return productRepo.findAll();}

	public Product getProductByTitle(String title) {
		Product result=null;
		for(Product product:productRepo.findAll()) {
			if (product.getTitle().equals(title)) {
				result=product;
			}
		}
			
		return result;
	}

}
