package com.axebeak.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.axebeak.model.Product;
import com.axebeak.model.Product.PRODUCTTYPE;
import com.axebeak.repositories.ProductRepository;

@Transactional
@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	public Iterable<Product> findAll(){
		return productRepo.findAll();
	}

	public Product getProductById(Integer id) {
		return productRepo.findById(id).get();
	}
	
	public void deleteProduct(Product prod) {
		productRepo.delete(prod);
	}
	
	public Product addProduct(Product prod) {
        return productRepo.save(prod);
	}
	
	public void updateProduct(Product prod) {
		productRepo.save(prod);
	}

	//returns entire database of products, minus the albums
	public Iterable<Product> getAllSongs(){
		Iterable<Product> prods = productRepo.findAll();
		List<Product> songs = new ArrayList<>();
		
		for(Product p : prods) {
			if(p.getProduct_type() == Product.PRODUCTTYPE.SONG) {
				songs.add(p);
			}
		}
		return songs;
	}
	
	//returns entire database of products, minus the songs
	public Iterable<Product> getAllAlbums(){
		Iterable<Product> prods = productRepo.findAll();
		List<Product> albums = new ArrayList<>();
		
		for(Product p : prods) {
			if(p.getProduct_type() == Product.PRODUCTTYPE.ALBUM) {
				albums.add(p);
			}
		}
		return albums;
	}

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
