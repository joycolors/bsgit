package cn.pao.pojo;

import java.util.Date;

public class TOrder {
    private Integer orderId;

    private Integer userId;

    private Integer orderCategory;

    private String orderContent;

    private Integer addressOne;

    private Integer addressTwo;

    private Date orderTime;

    private String orderStatus;

    private String orderRemark;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderCategory() {
        return orderCategory;
    }

    public void setOrderCategory(Integer orderCategory) {
        this.orderCategory = orderCategory;
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent == null ? null : orderContent.trim();
    }

    public Integer getAddressOne() {
        return addressOne;
    }

    public void setAddressOne(Integer addressOne) {
        this.addressOne = addressOne;
    }

    public Integer getAddressTwo() {
        return addressTwo;
    }

    public void setAddressTwo(Integer addressTwo) {
        this.addressTwo = addressTwo;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }
}