package com.zmd.elm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.zmd.elm.po.Orders;

@Mapper
public interface OrdersMapper {
	public int saveOrders(Orders orders);
	
	public Orders getOrdersByOrderId(Integer orderId);
	
	public List<Orders> listOrdersByUserId(String userId);
}
