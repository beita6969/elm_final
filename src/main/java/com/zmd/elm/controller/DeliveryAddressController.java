package com.zmd.elm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zmd.elm.po.DeliveryAddress;
import com.zmd.elm.service.DeliveryAddressService;

@RestController
@RequestMapping("/DeliveryAddressController")
public class DeliveryAddressController {

	@Autowired
	private DeliveryAddressService deliveryAddressService;

	@RequestMapping("/listDeliveryAddressByUserId")
	public List<DeliveryAddress> listDeliveryAddressByUserId(DeliveryAddress deliveryAddress) throws Exception {
		return deliveryAddressService.listDeliveryAddressByUserId(deliveryAddress.getUserId());
	}
	
	@RequestMapping("/saveDeliveryAddress")
	public int saveDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception {
		return deliveryAddressService.saveDeliveryAddress(deliveryAddress);
	}

	@RequestMapping("/updateDeliveryAddress")   //DeliveryAddressController/updateDeliveryAddress
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress){
		return deliveryAddressService.updateDeliveryAddress(deliveryAddress);
    }

	
	// 删除地址信息，根据daId
	@RequestMapping("/removeDeliveryAddress") // DeliveryAddressController/removeDeliveryAddress
    public int removeDeliveryAddress(DeliveryAddress deliveryAddress){
		return deliveryAddressService.removeDeliveryAddress(deliveryAddress);
    }

	
}