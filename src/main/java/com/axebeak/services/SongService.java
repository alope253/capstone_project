package com.axebeak.services;

import com.axebeak.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axebeak.repositories.SongRepository;

@Service
public class SongService {

	@Autowired 
	SongRepository songRepo;


	//returns entire database of songs
	public Iterable<Song> getAllSongs(){return songRepo.findAll();}

	//creates the string currently displayed on shop page
	public String songsToString(){
		StringBuilder stringBuilder=new StringBuilder();
		for(Song song:songRepo.findAll()){
			stringBuilder.append(song.getTitle());
			stringBuilder.append("\t");
			stringBuilder.append(song.getRelease_date());
			stringBuilder.append("\t");
			stringBuilder.append(song.getArtist());
			stringBuilder.append("\t");
			stringBuilder.append(song.getAlbums());
			stringBuilder.append("\t");
			stringBuilder.append(song.getGenre());
			stringBuilder.append("\t");
			stringBuilder.append(song.getDescription());
			stringBuilder.append("\t");
			stringBuilder.append(song.getPrice());
			stringBuilder.append("\n");

		}
		return stringBuilder.toString();
	}

}
