package com.hdc.lsp.mapper;

  
 
import java.util.List;

import com.hdc.lsp.pojo.Course;
import com.hdc.lsp.pojo.User;


public interface UserMapper {
	
//	添加用户
	public Integer addUser(User user);
	
//	根据用户名查询信息
	public User getUser(User user);
	
//	查询所有用户
	public List<User> getUserList();
	
//	修改用户信息
	public Integer updateUser(User user);
		
//	删除用户
	public Integer deleteUser(User user);
	
//	查询
	public List<User> search(String search); 
	
//	查询用户详细信息（查询所有用户及详细信息）
	public List<User> findUserMessage(User user);
   
}
