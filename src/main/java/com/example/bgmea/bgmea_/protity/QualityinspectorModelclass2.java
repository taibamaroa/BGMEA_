package com.example.bgmea.bgmea_.protity;

import java.io.Serializable;
import java.time.LocalDate;

public class QualityinspectorModelclass2 implements Serializable {
    private String batchId;
    private String name;
    private LocalDate date;
    private String status;

    public QualityinspectorModelclass2(String batchId, String name, LocalDate date, String status) {
        this.batchId = batchId;
        this.name = name;
        this.date = date;
        this.status = status;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "QualityinspectorModelclass2{" +
                "batchId='" + batchId + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
