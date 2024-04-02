package com.project.tunehub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/")
	public String loginUser() {
		return "login";
	}
	@GetMapping("/back")
	public String backAdmin() {
		return "adminhome";
	}
	
//	@GetMapping("/login")
//	public String login() {
//		return "login";
//	}
	
	@GetMapping("/registration")
	public String register() {
		return "registration";
	}
	
	@GetMapping("/newsong")
	public String newsong() {
		return "newsong";
	}

	@GetMapping("/logout")
	public String logout() {
		return "login";
	}
}
