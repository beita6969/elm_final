package com.zmd.elm.service;

import java.util.List;

import com.zmd.elm.po.DeliveryAddress;

public interface DeliveryAddressService {

	public List<DeliveryAddress> listDeliveryAddressByUserId(String userId);
	
	public int saveDeliveryAddress(DeliveryAddress deliveryAddress);
	
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress);

    public int removeDeliveryAddress(DeliveryAddress deliveryAddress);
}
