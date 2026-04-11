package com.example.bgmea.bgmea_.Taiba;


import java.io.Serializable;

public class HRModelclass2 implements Serializable {

    private String factoryId;
    private String factoryName;
    private String findings;
    private String location;

    public HRModelclass2(String factoryId, String factoryName, String findings, String location) {
        this.factoryId = factoryId;
        this.factoryName = factoryName;
        this.findings = findings;
        this.location = location;
    }

    public String getFactoryId() { return factoryId; }
    public String getFactoryName() { return factoryName; }
    public String getFindings() { return findings; }
    public String getLocation() { return location; }

    public void setFactoryId(String factoryId) { this.factoryId = factoryId; }
    public void setFactoryName(String factoryName) { this.factoryName = factoryName; }
    public void setFindings(String findings) { this.findings = findings; }
    public void setLocation(String location) { this.location = location; }

    @Override
    public String toString() {
        return "HRModelclass2{" +
                "factoryId='" + factoryId + '\'' +
                ", factoryName='" + factoryName + '\'' +
                ", findings='" + findings + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}