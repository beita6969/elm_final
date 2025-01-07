package com.zmd.elm.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.zmd.elm.po.User;

@Mapper
public interface UserMapper {
	
	// 根据用户名密码得到用户信息。
	@Select("SELECT * FROM user WHERE userId = #{userId} AND password = #{password}")
	public User getUserByIdByPass(User user);
	
	// 添加用户信息
	@Insert("INSERT INTO user (userId, password, userName, userSex, userImg, delTag)"
			+ "VALUES (#{userId},#{password},#{userName},#{userSex},#{userImg},#{delTag})")
	public int saveUser(User user);
	
}
