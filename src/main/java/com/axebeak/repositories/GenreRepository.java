package com.axebeak.repositories;

import org.springframework.data.repository.CrudRepository;

import com.axebeak.model.Genre;

public interface GenreRepository extends CrudRepository<Genre, Integer> {

}
