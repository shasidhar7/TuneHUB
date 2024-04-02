package com.project.tunehub.service;

import com.project.tunehub.entity.User;

public interface UserService {
	
	public String addusers(User user);

	public boolean emailExists(String email);
	
	public boolean validateUser(String email, String password);
	
	public String getRole(String email);
	
	public User getUser(String email);
	public void updateUser(User user);
}
