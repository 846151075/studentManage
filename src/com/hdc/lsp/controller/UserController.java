package com.hdc.lsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hdc.lsp.pojo.User;
import com.hdc.lsp.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping
	public String index() {
		return "login";
	}
	@GetMapping("/relogin")
	public String login() {
		return "login";
	}
	/*
	 * 用户查询 用户列表 修改用户 删除用户
	 */
	/**
	 * 登录
	 * @param user
	 * @return ModelAndView
	 */
	@RequestMapping("/login")
	public ModelAndView login(User user) {
		ModelAndView mView = new ModelAndView();
		System.out.println(user+"---------------------------------------------------");
		if (userService.login(user)) {
			mView.addObject("user", user);
			mView.setViewName("index");
		}else {
			mView.addObject("login", "false");
			mView.setViewName("error");
		}		  
		return mView;
	}
	/**
	 * 用户管理
	 * @param mView
	 * @return ModelAndView
	 */
	@RequestMapping("/musers")
	public ModelAndView managerUsers(ModelAndView mView) {		  
		mView.addObject("list", userService.getUserList());
		mView.setViewName("musers");
		return mView;
	}	
	/**
	 * 测试页面
	 * @return
	 */
	@GetMapping("/test")
	public String test() {
		System.out.println("test");
		return "manageusers";
	}
	
	/**
	 * 修改用户页面
	 * @return String
	 */
	@GetMapping("/updateUserView/{id}")
	public String updateUserView(@PathVariable("id") Integer id,ModelMap map) {
		map.put("user", userService.getUser(new User(id)));
		return "updateUser";
	}
	
	/**
	 * 修改用户数据
	 * @return ModelAndView
	 */
	@PostMapping("/updateUser")
	public ModelAndView updateUser(User user,ModelAndView mAndView) {
		userService.updateUser(user);
		mAndView.addObject("list", userService.getUserList());
		mAndView.setViewName("musers");
		return mAndView;
	}
	/**
	 * 删除用户
	 * @return String
	 */
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") Integer id,ModelMap map) {
		userService.deleteUser(new User(id));
		map.put("list", userService.getUserList());		 
		return "musers";
	}
	/**
	 * 搜索
	 * @param search
	 * @param map
	 * @return String
	 */
	@GetMapping("/search")
	public String search(String search,ModelMap map) {
		System.out.println(search+"----------------------------");
		map.put("list", userService.search(search));		 
		return "musers";
	}
}
