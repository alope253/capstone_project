package com.axebeak.services;

import com.axebeak.model.Song;
import org.springframework.beans.factory.annotation.Autowired;

import com.axebeak.repositories.SongRepository;

public class SongService {

	@Autowired 
	SongRepository songRepo;


	public String songsToString(){
		StringBuilder stringBuilder=new StringBuilder();
		for(Song song:songRepo.findAll()){
			stringBuilder.append(song.getTitle());
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}
	
}
