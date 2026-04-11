package com.example.bgmea.bgmea_.protity;

import java.io.Serializable;

public class ProductionManagerModelclass3 implements Serializable {
    private String id;
    private String name;
    private String skill;
    private String availability;

    public ProductionManagerModelclass3(String availability, String name, String id, String skill) {
        this.availability = availability;
        this.name = name;
        this.id = id;
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "ProductionManagerModelclass3{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }
}
