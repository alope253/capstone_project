package com.axebeak.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.axebeak.repositories.SongRepository;

public class SongService {

	@Autowired 
	SongRepository songRepo;
}
