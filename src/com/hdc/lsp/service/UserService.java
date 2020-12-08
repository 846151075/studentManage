package com.hdc.lsp.service;

import java.util.List;

import com.hdc.lsp.pojo.User;

public interface UserService {

	/**
	 * 添加用户
	 * @param user
	 * @return Integer
	 */
	public Integer addUser(User user);
	
	/**
	 * 根据用户名查询信息
	 * @param user
	 * @return User
	 */
	public User getUser(User user);
	
	/**
	 * 查询所有用户
	 * @return List
	 */
	public List<User> getUserList();
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return Integer
	 */
	public Integer updateUser(User user);
		
	/**
	 * 删除用户
	 * @param user
	 * @return Integer
	 */
	public Integer deleteUser(User user);
	
	/**
	 * 登录
	 * @param user
	 * @return boolean
	 */
	public boolean login(User user);
	
	/**
	 * 模糊查询
	 * @param search
	 * @return List
	 */
	public List<User> search(String search);
	
	/**
	 * 查询用户详细信息（查询所有用户及详细信息，详细信息包括班级、课程）
	 * @param user
	 * @return List
	 */
	public List<User> findUserMessage(User user);
}
