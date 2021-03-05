package com.axebeak.repositories;

import org.springframework.data.repository.CrudRepository;

import com.axebeak.model.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Integer>{

}