package com.example.adventure.adventure.models;

public class NPC {

    private String name;

    private int healthPoints;

    private int attackValue;

    public NPC(String name, int healthPoints, int attackValue){
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
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

    public NPC(){
    }
}
