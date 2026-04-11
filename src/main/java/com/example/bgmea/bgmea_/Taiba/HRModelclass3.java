package com.example.bgmea.bgmea_.Taiba;



public class HRModelclass3  {

    private String workerId;
    private String name;
    private String department;

    public HRModelclass3(String workerId, String name, String department) {
        this.workerId = workerId;
        this.name = name;
        this.department = department;
    }

    public String getWorkerId() {
        return workerId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "HRModelclass3{" +
                "workerId='" + workerId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}