package com.zmd.elm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zmd.elm.po.Orders;
import com.zmd.elm.service.OrderService;

@RestController
@RequestMapping("/OrderController")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/createOrders")
	public Integer createOrders(@RequestBody Orders orders) {
		System.out.println("接收到的订单数据：" + orders);
		return orderService.createOrders(orders);
	}
	
	@RequestMapping("/getOrdersById")
	public Orders getOrdersById(Integer orderId) {
		return orderService.getOrdersByOrderId(orderId);
	}
	
	@RequestMapping("/listOrdersByUserId")
	public List<Orders> listOrdersByUserId(String userId) {
		System.out.println("查询用户订单，userId: " + userId);
		List<Orders> orders = orderService.listOrdersByUserId(userId);
		for (Orders order : orders) {
			System.out.println("订单ID: " + order.getOrderId() 
				+ ", 状态: " + order.getOrderState() 
				+ ", 状态类型: " + order.getOrderState().getClass().getName());
		}
		return orders;
	}
}
