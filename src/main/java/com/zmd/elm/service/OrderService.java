package com.zmd.elm.service;

import java.util.List;

import com.zmd.elm.po.Orders;

public interface OrderService {
	
	public int createOrders(Orders orders);
	
	public Orders getOrdersByOrderId(Integer orderId);
	
	public List<Orders> listOrdersByUserId(String userId);

}
