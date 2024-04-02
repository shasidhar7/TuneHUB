package com.project.tunehub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tunehub")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	String userid;
	String username;
	String email;
	String password;
	String gender;
	String role;
	String address;
	boolean ispremium;
	
	public User(String userid, String username, String email, String password, String gender, String role,
			String address, boolean ispremium) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.role = role;
		this.address = address;
		this.ispremium = ispremium;
	}
	
	public User() {
		super();
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isIspremium() {
		return ispremium;
	}
	public void setIspremium(boolean ispremium) {
		this.ispremium = ispremium;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", role=" + role + ", address=" + address + ", ispremium=" + ispremium + "]";
	}

	
	

}
