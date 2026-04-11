package com.example.bgmea.bgmea_.protity;

import java.io.Serializable;
import java.time.LocalDate;

public class QualityinspectorModelclass3 implements Serializable {

    private String batchId;
    private LocalDate date;
    private String status;
    private String action;

    public QualityinspectorModelclass3(String batchId, LocalDate date, String status, String action) {
        this.batchId = batchId;
        this.date = date;
        this.status = status;
        this.action = action;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "QualityinspectorModelclass3{" +
                "batchId='" + batchId + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
