package com.example.adventure.adventure.models;


import java.util.ArrayList;

// name, healthpoints, inventory (dictionary array list), attack method, change weapon
public class Player {

    private String name;

    private int healthPoints;

    private ArrayList<Weapon> weapons;
    private ArrayList<Potion> potions;

    private int gold;

    public Player(int gold, String name, int healthPoints){
        this.gold = gold;
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapons = new ArrayList<Weapon>();
        this.potions = new ArrayList<Potion>();
    }

    //    gets the healing value of the selected (first in array) potion
    public int getHealingPointsOfFirstPotionInArray(){
        return potions.get(0).getHealingPoints();
    }

    //    gets the attack value of the selected (first in array) weapon
    public int getAttackPointsOfFirstWeaponInArray(){
        return weapons.get(0).getAttackPoints();
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public void removePotion(Potion potion){
        potions.remove(potion);
    }

    public void addPotion(Potion potion){
        potions.add(potion);
    }

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }

    public void removeWeapon(Weapon weapon){
        weapons.remove(weapon);
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
