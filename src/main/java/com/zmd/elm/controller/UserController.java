package com.zmd.elm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zmd.elm.po.User;
import com.zmd.elm.service.UserService;

@RestController
@RequestMapping("/UserController")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUserByIdByPass") // http://localhost:8888/elm//UserController/getUserByIdByPass?userId=11111111111&password=123
	public User getUserByIdByPass(User user) throws Exception{
		return userService.getUserByIdByPass(user);
	}	
	
	@RequestMapping("/saveUser") // UserController/saveUser
	public int saveUser(User user) {
		// TODO 自动生成的方法存根
		return userService.saveUser(user);
	}
}
