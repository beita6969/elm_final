package com.zmd.elm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zmd.elm.po.Business;
import com.zmd.elm.service.BusinessService;

@RestController
@RequestMapping("/BusinessController")
public class BusinessController {

	@Autowired
	private BusinessService businessService;

	@RequestMapping("/listBusinessByOrderTypeId") // BusinessController/listBusinessByOrderTypeId
	public List<Business> listBusinessByOrderTypeId(Business business) throws Exception {

		return businessService.listBusinessByOrderTypeId(business.getOrderTypeId());
	}

	// 根据商家id查询商家信息
	@RequestMapping("/getBusinessById")
	public Business getBusinessById(Business business) {
		return businessService.getBusinessById(business.getBusinessId());

	}

}
