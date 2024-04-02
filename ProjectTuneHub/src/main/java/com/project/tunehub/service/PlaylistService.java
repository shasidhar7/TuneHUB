package com.project.tunehub.service;

import java.util.List;

import com.project.tunehub.entity.Playlist;

public interface PlaylistService {

	public void addPlaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();

}
