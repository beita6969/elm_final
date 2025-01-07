package com.zmd.elm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zmd.elm.constant.OrderStatus;
import com.zmd.elm.exception.BusinessException;
import com.zmd.elm.mapper.CartMapper;
import com.zmd.elm.mapper.OrderDetailetMapper;
import com.zmd.elm.mapper.OrdersMapper;
import com.zmd.elm.po.Cart;
import com.zmd.elm.po.OrderDetailet;
import com.zmd.elm.po.Orders;
import com.zmd.elm.service.OrderService;
import com.zmd.elm.util.CommomUtil;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private CartMapper cartMapper;
	@Autowired
	private OrdersMapper ordersMapper;
	@Autowired
	private OrderDetailetMapper orderDetailetMapper;
	
	@Override
	@Transactional
	public int createOrders(Orders orders) {
		try {
			// 1. 创建订单
			orders.setOrderDate(CommomUtil.getcurrentDate());
			orders.setOrderState(OrderStatus.PAID.getCode());
			ordersMapper.saveOrders(orders);
			int orderId = orders.getOrderId();

			// 2. 查询当前用户购物车中的所有食品信息
			Cart cart = new Cart();
			cart.setUserId(orders.getUserId());
			cart.setBusinessId(orders.getBusinessId());
			List<Cart> cartList = cartMapper.listCart(cart);

			// 3. 批量添加订单明细
			if (!cartList.isEmpty()) {
				List<OrderDetailet> list = new ArrayList<>();
				for (Cart c : cartList) {
					OrderDetailet od = new OrderDetailet();
					od.setOrderId(orderId);
					od.setFoodId(c.getFoodId());
					od.setQuantity(c.getQuantity());
					list.add(od);
				}
				orderDetailetMapper.saveOrderDetailetBatch(list);

				// 4. 从购物车当中删除相关食品信息
				cartMapper.removeCart(cart);
			}

			return orderId;
		} catch (Exception e) {
			throw new BusinessException("创建订单失败：" + e.getMessage(), e);
		}
	}

	@Override
	public Orders getOrdersByOrderId(Integer orderId) {
		return ordersMapper.getOrdersByOrderId(orderId);
	}

	@Override
	public List<Orders> listOrdersByUserId(String userId) {
		return ordersMapper.listOrdersByUserId(userId);
	}
}
