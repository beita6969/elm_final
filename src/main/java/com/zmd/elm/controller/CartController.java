package com.zmd.elm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zmd.elm.po.Cart;
import com.zmd.elm.service.CartService;

@RestController
@RequestMapping("/CartController")
public class CartController {

	@Autowired
	private CartService cartService;

	// 向购物车表中添加数据。
	@RequestMapping("/saveCart") // CartController/saveCart
	public int saveCart(Cart cart) {
		return cartService.saveCart(cart);
	}

	// 向购物车表中更新数据。
	@RequestMapping("/updateCart") // CartController/updateCart
	public int updateCart(Cart cart) {
		return cartService.updateCart(cart);
	}
	
	@RequestMapping("/removeCart")
	public int removeCart(Cart cart){
		return cartService.removeCart(cart);
	}
	
	
	//根据用户id,商家id,食品id，查询多表结合的数据，返回值为Cart 但是cart中包含了food和business 为属性
	@RequestMapping("/listCart") // CartController/listCart
	public List<Cart> listCart(Cart cart) {
		return cartService.listCart(cart);
	}

}
