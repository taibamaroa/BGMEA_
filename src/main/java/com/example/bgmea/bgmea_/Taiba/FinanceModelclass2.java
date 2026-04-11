package com.example.bgmea.bgmea_.Taiba;


public class FinanceModelclass2  {

    private String claimId;
    private double amount;
    private String status;
    private String bank;

    public FinanceModelclass2(String claimId, double amount, String status, String bank) {
        this.claimId = claimId;
        this.amount = amount;
        this.status = status;
        this.bank = bank;
    }

    public String getClaimId() {
        return claimId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public String getBank() {
        return bank;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "FinanceModelclass2{" +
                "claimId='" + claimId + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", bank='" + bank + '\'' +
                '}';
    }
}