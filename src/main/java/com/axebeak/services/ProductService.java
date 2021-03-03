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

	//creates the string currently displayed on shop page
	public String songsToString(){
		StringBuilder stringBuilder=new StringBuilder();
		for(Product p:productRepo.findAll()){
			stringBuilder.append(p.getTitle());
			stringBuilder.append("\t");
			stringBuilder.append(p.getRelease_date());
			stringBuilder.append("\t");
			stringBuilder.append(p.getArtists());
			stringBuilder.append("\t");
			stringBuilder.append(p.getGenre());
			stringBuilder.append("\t");
			stringBuilder.append(p.getDescription());
			stringBuilder.append("\t");
			stringBuilder.append(p.getPrice());
			stringBuilder.append("\n");

		}
		return stringBuilder.toString();
	}

}
