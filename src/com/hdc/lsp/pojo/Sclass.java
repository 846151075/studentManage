package com.hdc.lsp.pojo;

import java.util.List;

public class Sclass {
	private int sId;
	private String sName;
	private int sNum;
	private List<User> users;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsNum() {
		return sNum;
	}
	public void setsNum(int sNum) {
		this.sNum = sNum;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "班级Id:" + sId + ", 班级名称:" + sName + ", 班级人数:" + sNum + ", 用户列表:" + users + "]";
	}
	
	
}
