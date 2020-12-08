package com.hdc.lsp.pojo;

import java.util.List;

public class User {
	private Integer id;
	private String username;
	private String password;
	private Sclass sclass;
	private List<Course> courses;

	public User() {
		super();
	}

	public User(Integer id) {
		super();
		this.id = id;
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Sclass getSclass() {
		return sclass;
	}

	public void setSclass(Sclass sclass) {
		this.sclass = sclass;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "id=" + id + ", username=" + username;
	}

 
	  
}
