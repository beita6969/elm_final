package com.zmd.elm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zmd.elm.po.Food;
import com.zmd.elm.service.FoodService;

@RestController
@RequestMapping("/FoodController")
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	@RequestMapping("/listFoodBybussinessId") // FoodController/listFoodBybussinessId?businessId=10001
	public List<Food> listFoodBybussinessId(Food food) throws Exception{
		// TODO 自动生成的方法存根
		return foodService.listFoodBybussinessId(food.getBusinessId());
	}

}
