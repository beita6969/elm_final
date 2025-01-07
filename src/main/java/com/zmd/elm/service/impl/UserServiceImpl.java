package com.zmd.elm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmd.elm.mapper.UserMapper;
import com.zmd.elm.po.User;
import com.zmd.elm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserByIdByPass(User user) {
		return userMapper.getUserByIdByPass(user);
	}

	@Override
	public int saveUser(User user) {
		// TODO 自动生成的方法存根
		return userMapper.saveUser(user);
	}

}
