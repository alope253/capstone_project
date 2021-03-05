package com.axebeak.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.axebeak.model.Artist;
import com.axebeak.repositories.ArtistRepository;


@Transactional
@Service
public class ArtistService {

	@Autowired
	private ArtistRepository artuctRepo;
	
	public Iterable<Artist> findAll(){
		return artuctRepo.findAll();
	}

	public Artist getArtistById(Integer id) {
		return artuctRepo.findById(id).get();
	}
	
	public void deleteArtist(Artist art) {
		artuctRepo.delete(art);
	}
	
	public Artist addArtist(Artist art) {
        return artuctRepo.save(art);
	}
	
	public void updateArtist(Artist art) {
		artuctRepo.save(art);
	}
}