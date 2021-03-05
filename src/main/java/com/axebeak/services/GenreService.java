package com.axebeak.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.axebeak.model.Genre;
import com.axebeak.repositories.GenreRepository;


@Transactional
@Service
public class GenreService {

	@Autowired
	private GenreRepository genreRepo;
	
	public Iterable<Genre> findAll(){
		return genreRepo.findAll();
	}

	public Genre getGenreById(Integer id) {
		return genreRepo.findById(id).get();
	}
	
	public void deleteGenre(Genre gen) {
		genreRepo.delete(gen);
	}
	
	public Genre addGenre(Genre gen) {
        return genreRepo.save(gen);
	}
	
	public void updateGenre(Genre gen) {
		genreRepo.save(gen);
	}
}
