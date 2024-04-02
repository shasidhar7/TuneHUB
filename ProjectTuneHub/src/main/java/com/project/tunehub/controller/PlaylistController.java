package com.project.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.tunehub.entity.Playlist;
import com.project.tunehub.entity.Song;
import com.project.tunehub.service.PlaylistService;
import com.project.tunehub.service.SongService;

@Controller
public class PlaylistController {
	@Autowired
	SongService songService;
	
	@Autowired
	PlaylistService playlistService;
	
	@GetMapping("/createplaylist")
	public String createPlaylist(Model model){
		List<Song> songList = songService.fetchAllSongs();
		model.addAttribute("songs", songList);
		return "createplaylists";
	}
	
	@PostMapping("/addplaylist")
	public String addPlaylist(@ModelAttribute Playlist playlist) {
		//updating the playlist table
		playlistService.addPlaylist(playlist);
		
		//updating the song table
		List<Song> songList = playlist.getSongs();
		for (Song s : songList) {
			s.getPlaylists().add(playlist);
			songService.updateSong(s);
		}
		return "adminhome";
		
	}
	
	@GetMapping("/viewplaylist")
	public String viewPlaylist(Model model){
		List<Playlist> allplaylist = playlistService.fetchAllPlaylists();
		model.addAttribute("playlists", allplaylist);
		return "displayplaylist";
	}

}
