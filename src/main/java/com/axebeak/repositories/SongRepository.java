package com.axebeak.repositories;

import org.springframework.data.repository.CrudRepository;

import com.axebeak.model.Song;

public interface SongRepository extends CrudRepository<Song, Integer> {

}
