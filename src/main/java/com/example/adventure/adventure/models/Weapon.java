package com.example.adventure.adventure.models;

public class Weapon {

    private int attackPoints;

    private String name;

    public Weapon(int attackPoints, String name){
        this.attackPoints = attackPoints;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public Weapon(){
    }

}
