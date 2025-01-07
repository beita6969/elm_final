package com.zmd.elm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zmd.elm.mapper.OrderDetailetMapper;
import com.zmd.elm.po.OrderDetailet;

@RestController
@RequestMapping("/OrderDetailController")
public class OrderDetailController {

    @Autowired
    private OrderDetailetMapper orderDetailetMapper;

    @RequestMapping("/saveOrderDetailetBatch")
    public void saveOrderDetailetBatch(@RequestBody List<OrderDetailet> list) {
        System.out.println("接收到的订单详情数据：" + list);
        orderDetailetMapper.saveOrderDetailetBatch(list);
    }
} 