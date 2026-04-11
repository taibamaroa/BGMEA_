package com.example.bgmea.bgmea_.Taiba;


import java.io.Serializable;
import java.time.LocalDate;

public class FinanceModelclass1  {

    private String factoryId;
    private double amount;
    private double dues;
    private LocalDate date;

    public FinanceModelclass1(String factoryId, double amount, double dues, LocalDate date) {
        this.factoryId = factoryId;
        this.amount = amount;
        this.dues = dues;
        this.date = date;
    }

    public String getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDues() {
        return dues;
    }

    public void setDues(double dues) {
        this.dues = dues;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FinanceModelclass1{" +
                "factoryId='" + factoryId + '\'' +
                ", amount=" + amount +
                ", dues=" + dues +
                ", date=" + date +
                '}';
    }
}