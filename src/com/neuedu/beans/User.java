package com.neuedu.beans;

public class User {
	private String username;
	private String password;
	private String email;
	private int qx;
	private int id;
	public User(){
		
	}
	public User(String username, String password, String email, int qx, int id) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.qx = qx;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getQx() {
		return qx;
	}
	public void setQx(int qx) {
		this.qx = qx;
	}
	
	
	
	
	
}
