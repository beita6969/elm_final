package com.zmd.elm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmd.elm.mapper.CartMapper;
import com.zmd.elm.po.Cart;
import com.zmd.elm.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartMapper cartMapper;

	@Override
	public int saveCart(Cart cart) {
		// TODO 自动生成的方法存根
		return cartMapper.saveCart(cart);
	}

	@Override
	public int updateCart(Cart cart) {
		// TODO 自动生成的方法存根
		return cartMapper.updateCart(cart);
	}

	@Override
	public int removeCart(Cart cart) {
		// TODO 自动生成的方法存根
		return cartMapper.removeCart(cart);
	}

	@Override
	public List<Cart> listCart(Cart cart) {
		// TODO 自动生成的方法存根
		return cartMapper.listCart(cart);
	}
	


}
