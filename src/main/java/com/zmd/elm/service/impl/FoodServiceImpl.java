package com.zmd.elm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmd.elm.mapper.FoodMapper;
import com.zmd.elm.po.Food;
import com.zmd.elm.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	private FoodMapper foodMapper;
	
	
	@Override
	public List<Food> listFoodBybussinessId(Integer bussinessId) {
		// TODO 自动生成的方法存根
		return foodMapper.listFoodBybussinessId(bussinessId);
	}

}
