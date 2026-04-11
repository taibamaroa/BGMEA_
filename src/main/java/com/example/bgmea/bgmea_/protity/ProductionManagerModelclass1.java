package com.example.bgmea.bgmea_.protity;

public class ProductionManagerModelclass1 {
    private String line;
    private int workers;
    private String status;

    public ProductionManagerModelclass1(String status, String line, int workers) {
        this.status = status;
        this.line = line;
        this.workers = workers;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
