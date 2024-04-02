package com.project.tunehub.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Playlist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	@ManyToMany
	List<Song> songs;
	
	public Playlist(int id, String name, List<Song> songs) {
		super();
		this.id = id;
		this.name = name;
		this.songs = songs;
	}
	
	public Playlist() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	@Override
	public String toString() {
		return "Playlist [id=" + id + ", name=" + name + "]";
	}
	
}
