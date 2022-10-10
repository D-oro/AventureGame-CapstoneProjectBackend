package com.example.adventure.adventure.models;


import java.util.ArrayList;

// name, healthpoints, inventory (dictionary array list), attack method, change weapon
public class Player {

    private String name;

    private int healthPoints;


//    private Inventory inventory;

    private int gold;

    public Player(int gold, String name, int healthPoints){
        this.gold = gold;
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(){
    }

}
