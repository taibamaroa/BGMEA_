package com.example.bgmea.bgmea_.protity;

import java.io.Serializable;

public class ProductionManagerModelclass2 implements Serializable {

    private String orderId;
    private String product;
    private int delayDays;
    private String status;

    public ProductionManagerModelclass2(String orderId, String product, int delayDays, String status) {
        this.orderId = orderId;
        this.product = product;
        this.delayDays = delayDays;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProduct() {
        return product;
    }

    public int getDelayDays() {
        return delayDays;
    }

    public String getStatus() {
        return status;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setDelayDays(int delayDays) {
        this.delayDays = delayDays;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ProductionManagerModelclass2{" +
                "orderId='" + orderId + '\'' +
                ", product='" + product + '\'' +
                ", delayDays=" + delayDays +
                ", status='" + status + '\'' +
                '}';
    }
}