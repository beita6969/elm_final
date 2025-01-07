package com.zmd.elm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.zmd.elm.po.Business;

@Mapper
public interface BusinessMapper {
	
	// 根据分类属性查询商家信息
	@Select("SELECT * FROM business WHERE orderTypeId = #{orderTypeId} ORDER BY businessId")
	public List<Business> listBusinessByOrderTypeId(Integer orderTypeId);
	
	// 根据商家id查询商家信息
	@Select("SELECT * FROM business WHERE businessId = #{bussinessId}")
	public Business getBusinessById(Integer bussinessId);
}
