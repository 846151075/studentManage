package com.hdc.lsp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdc.lsp.mapper.UserMapper;
import com.hdc.lsp.pojo.User;
import com.hdc.lsp.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;

	@Override
	public Integer addUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.addUser(user);
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.getUser(user);
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userMapper.getUserList();
	}

	@Override
	public Integer updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUser(user);
	}

	@Override
	public Integer deleteUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.deleteUser(user);
	}

	/**
	 * 登录认证
	 */
	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		if (user == null || user.getUsername().equals("")) {
			return false;
		}
		User u = userMapper.getUser(user);
		if (user ==null || u==null || user.getUsername().isEmpty() || user.getPassword().isEmpty()) {
			return false;
		}else if (!u.getPassword().equals(user.getPassword())) {
			return false;
		}
		return true;
	}

	@Override
	public List<User> search(String search) {
		// TODO Auto-generated method stub
		return userMapper.search(search);
	}

	@Override
	public List<User> findUserMessage(User user) {
		// TODO Auto-generated method stub
		return userMapper.findUserMessage(user);
	} 
}
