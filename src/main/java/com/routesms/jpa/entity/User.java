package com.routesms.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tblUsers")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String userId;
	private String username;
	private String userEmail;
	
	 public User( String username, String userEmail) {
		
	
		this.username = username;
		this.userEmail = userEmail;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", userEmail=" + userEmail + "]";
	}
	
	
	

}
