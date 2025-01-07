package com.zmd.elm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.zmd.elm.po.Cart;

@Mapper
public interface CartMapper {

	// 添加一条数据
	@Insert("INSERT INTO cart VALUES (NULL,#{foodId},#{businessId},#{userId},1)")
	public int saveCart(Cart cart);
	
	// 更新数据
	@Update("UPDATE cart SET quantity=#{quantity} WHERE foodId=#{foodId} AND businessId=#{businessId} AND userId=#{userId}")
	public int updateCart(Cart cart);

	// 删除数据
	public int removeCart(Cart cart);
	
	// 根据
	public List<Cart> listCart(Cart cart);
}
