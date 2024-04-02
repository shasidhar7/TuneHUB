package com.project.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.tunehub.entity.Song;
import com.project.tunehub.entity.User;
import com.project.tunehub.service.SongService;
import com.project.tunehub.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	@Autowired
	SongService songService;
	
	@PostMapping("/register")
	public String addusers(@ModelAttribute User user) {
		
		//email taken from registration form
		String email = user.getEmail();
		//checking if email as entered in registration form is present in Db or not
		boolean status = userService.emailExists(email);
		
		if(status == false)
		{
			userService.addusers(user);
			System.out.println("User Added");
		}
		else {
			System.out.println("User already Exists");
		}
		return "login";
	}
	
	@PostMapping("/validate")
	public String validate(@RequestParam("email") 
			String email, @RequestParam("password") String password, HttpSession session, Model model) {
		
		User user = userService.getUser(email);
		
		
		if(user!=null && userService.validateUser(email,password) == true) {
			
			String role= userService.getRole(email);
			
			session.setAttribute("email", email);
	
			if(role.equals("admin")) {
				return "adminhome";
			}else {
				//User user = userService.getUser(email);
				boolean userstatus = user.isIspremium();
				
				//fetching all songs in customer home
				List<Song> songList  = songService.fetchAllSongs();
				model.addAttribute("songs", songList);
				
				model.addAttribute("ispremium", userstatus);
				return "customerhome";
			}
			
		}else {
			model.addAttribute("error", "Invalid email or password");
			return "login";
		}
	}

}
