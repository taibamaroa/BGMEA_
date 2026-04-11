package com.example.bgmea.bgmea_.protity;

import java.io.Serializable;

public class ProductionManagerModelclass4 implements Serializable {

    private String batchId;
    private String product;
    private String status;

    public ProductionManagerModelclass4(String batchId, String product, String status) {
        this.batchId = batchId;
        this.product = product;
        this.status = status;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ProductionManagerModelclass4{" +
                "batchId='" + batchId + '\'' +
                ", product='" + product + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
