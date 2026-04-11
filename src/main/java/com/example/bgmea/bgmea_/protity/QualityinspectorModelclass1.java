package com.example.bgmea.bgmea_.protity;

import java.io.Serializable;

public class QualityinspectorModelclass1 implements Serializable {

    private String defectId;
    private String defectType;
    private int quantity;
    private String batch;

    public String getDefectId() {
        return defectId;
    }

    public void setDefectId(String defectId) {
        this.defectId = defectId;
    }

    public String getDefectType() {
        return defectType;
    }

    public void setDefectType(String defectType) {
        this.defectType = defectType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "QualityinspectorModelclass1{" +
                "defectId='" + defectId + '\'' +
                ", defectType='" + defectType + '\'' +
                ", quantity=" + quantity +
                ", batch='" + batch + '\'' +
                '}';
    }

    public QualityinspectorModelclass1(String defectId, String defectType, int quantity, String batch) {
        this.defectId = defectId;
        this.defectType = defectType;
        this.quantity = quantity;
        this.batch = batch;

    }
}
