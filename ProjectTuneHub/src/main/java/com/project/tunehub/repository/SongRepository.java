package com.project.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.tunehub.entity.Song;

@Repository
public interface SongRepository 
extends JpaRepository<Song, Integer>{

	public Song findByName(String name);

}
