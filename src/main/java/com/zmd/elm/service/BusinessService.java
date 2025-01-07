package com.zmd.elm.service;

import java.util.List;

import com.zmd.elm.po.Business;

public interface BusinessService {
	
	// 根据分类属性查询商家信息
	public List<Business> listBusinessByOrderTypeId(Integer orderTypeId);
	
	// 根据商家id查询商家信息
	public Business getBusinessById(Integer bussinessId);
}
