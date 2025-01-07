package com.zmd.elm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.zmd.elm.po.Food;

@Mapper
public interface FoodMapper {

	// 根据商家id查询食品列表
	@Select("SELECT * FROM `food` WHERE businessId = #{bussinessId}")
	public List<Food> listFoodBybussinessId(Integer bussinessId);

	@Select("SELECT * FROM food WHERE foodId = #{foodId}")
	public Food getFoodById(Integer foodId);
}
