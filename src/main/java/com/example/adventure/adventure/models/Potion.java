package com.example.adventure.adventure.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="potions")
public class Potion {

    private String name;

    private int healingPoints;

    public Potion(String name, int healingPoints){
        this.name = name;
        this.healingPoints = healingPoints;
    }

    public int getHealingPoints() {
        return healingPoints;
    }

    public void setHealingPoints(int healingPoints) {
        this.healingPoints = healingPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Potion(){

    }

}
