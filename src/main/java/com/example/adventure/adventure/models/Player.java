package com.example.adventure.adventure.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// name, healthpoints, inventory (dictionary array list), attack method, change weapon
@Entity
@Table(name="players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="health_points")
    private int healthPoints;

    @Column(name="gold")
    private int gold;

    @OneToMany(mappedBy="player", fetch=FetchType.LAZY)
    @JsonIgnoreProperties({"player"})
    private List<Weapon> weapons;

    @OneToMany(mappedBy="player", fetch=FetchType.LAZY)
    @JsonIgnoreProperties({"player"})
    private List<Potion> potions;

    public Player(int gold, String name, int healthPoints){
        this.gold = gold;
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapons = new ArrayList<Weapon>();
        this.potions = new ArrayList<Potion>();
    }

    public int getWeapons() {
        return weapons.size();
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }


    public int getPotions() {
        return potions.size();
    }

    public void setPotions(List<Potion> potions) {
        this.potions = potions;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
