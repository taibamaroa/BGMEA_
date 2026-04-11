package com.example.bgmea.bgmea_.protity;

import java.io.Serializable;

public class ProductionManagerModelclass1  implements Serializable {
    private String line;
    private int workers;
    private String status;

    public ProductionManagerModelclass1(String line, int workers, String status) {
        this.line = line;
        this.workers = workers;
        this.status = status;
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

    @Override
    public String toString() {
        return "ProductionManagerModelclass1{" +
                "line='" + line + '\'' +
                ", workers=" + workers +
                ", status='" + status + '\'' +
                '}';
    }
}
