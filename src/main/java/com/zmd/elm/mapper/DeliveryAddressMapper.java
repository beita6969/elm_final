package com.zmd.elm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zmd.elm.po.DeliveryAddress;

// 地址信息表
@Mapper
public interface DeliveryAddressMapper {

	@Select("SELECT * FROM deliveryaddress WHERE userId =#{userId} ORDER BY daId")
	public List<DeliveryAddress> listDeliveryAddressByUserId(String userId);

	
    @Insert("INSERT INTO deliveryAddress (contactName,contactSex,contactTel,address,userId) VALUES(#{contactName},#{contactSex},#{contactTel},#{address},#{userId})")
    @Options(useGeneratedKeys=true,keyProperty="userId",keyColumn="userId") // 自动增长列
    public int saveDeliveryAddress(DeliveryAddress deliveryAddress);

    // 根据daId更新地址信息
    @Update("UPDATE deliveryaddress "
    		+ "SET contactName=#{contactName},contactSex=#{contactSex},contactTel=#{contactTel},address=#{address}"
    		+ "WHERE daId = #{daId}") 
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress);
    
    // 根据daId删除地址信息
    @Delete("DELETE FROM deliveryaddress WHERE daId = #{daId}")
    public int removeDeliveryAddress(DeliveryAddress deliveryAddress);

}
