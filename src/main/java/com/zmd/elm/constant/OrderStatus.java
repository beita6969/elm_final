package com.zmd.elm.constant;

public enum OrderStatus {
    UNPAID(0, "未支付"),
    PAID(1, "已支付"),
    DELIVERED(2, "已配送"),
    COMPLETED(3, "已完成");
    
    private final int code;
    private final String description;
    
    OrderStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }
    
    public int getCode() {
        return code;
    }
    
    public String getDescription() {
        return description;
    }
} 