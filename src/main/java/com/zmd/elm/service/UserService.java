package com.zmd.elm.service;

import com.zmd.elm.po.User;

public interface UserService {

	public User getUserByIdByPass(User user);
	
	public int saveUser(User user);
}
