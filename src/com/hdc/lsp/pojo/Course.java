package com.hdc.lsp.pojo;

import java.util.List;

public class Course {
	private int cId;
	private String cName;
	private List<User> users;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "课程ID=" + cId + ", 课程名称=" + cName;
	}
	 
	
}
