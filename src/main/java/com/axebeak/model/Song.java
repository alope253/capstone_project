package com.axebeak.model;

import java.sql.Date;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Song {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int song_id;
	
	public String title;
	public Date release_date;
	public float price;
	public String description;
	
	public Genre genre;
	
	public String artist;
	public String label;

}
