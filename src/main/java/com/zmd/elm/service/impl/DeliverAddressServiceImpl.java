package com.zmd.elm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmd.elm.mapper.DeliveryAddressMapper;
import com.zmd.elm.po.DeliveryAddress;
import com.zmd.elm.service.DeliveryAddressService;

@Service
public class DeliverAddressServiceImpl implements DeliveryAddressService {

	@Autowired
	private DeliveryAddressMapper deliveryAddressMapper;
	
	@Override
	public List<DeliveryAddress> listDeliveryAddressByUserId(String userId) {
		
		return deliveryAddressMapper.listDeliveryAddressByUserId(userId);
	}

	// 添加地址信息
	@Override
	public int saveDeliveryAddress(DeliveryAddress deliveryAddress) {
		// TODO 自动生成的方法存根
		return deliveryAddressMapper.saveDeliveryAddress(deliveryAddress);
	}

	// 删除地址信息
	@Override
	public int removeDeliveryAddress(DeliveryAddress deliveryAddress) {
		return deliveryAddressMapper.removeDeliveryAddress(deliveryAddress);
	}

	@Override
	public int updateDeliveryAddress(DeliveryAddress deliveryAddress) {
		return deliveryAddressMapper.updateDeliveryAddress(deliveryAddress);
	}

}