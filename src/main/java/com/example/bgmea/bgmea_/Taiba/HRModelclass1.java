package com.example.bgmea.bgmea_.Taiba;


import java.time.LocalDate;

public class HRModelclass1  {

    private String workerId;
    private String name;
    private String nid;
    private LocalDate joiningDate;

    public HRModelclass1(String workerId, String name, String nid, LocalDate joiningDate) {
        this.workerId = workerId;
        this.name = name;
        this.nid = nid;
        this.joiningDate = joiningDate;
    }

    public String getWorkerId() {
        return workerId;
    }

    public String getName() {
        return name;
    }

    public String getNid() {
        return nid;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }


    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "HRModelclass1{" +
                "workerId='" + workerId + '\'' +
                ", name='" + name + '\'' +
                ", nid='" + nid + '\'' +
                ", joiningDate=" + joiningDate +
                '}';
    }
}