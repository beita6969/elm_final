package com.zmd.elm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmd.elm.mapper.BusinessMapper;
import com.zmd.elm.po.Business;
import com.zmd.elm.service.BusinessService;

@Service
public class BusinessServiceImpl implements BusinessService{

	@Autowired
	private BusinessMapper businessMapper;
	
	// 根据分类属性查询商家信息
	@Override
	public List<Business> listBusinessByOrderTypeId(Integer orderTypeId) {
		return businessMapper.listBusinessByOrderTypeId(orderTypeId);
	}

	// 根据商家id查询商家信息
	@Override
	public Business getBusinessById(Integer bussinessId) {
		return businessMapper.getBusinessById(bussinessId);
	}
	
	

}
