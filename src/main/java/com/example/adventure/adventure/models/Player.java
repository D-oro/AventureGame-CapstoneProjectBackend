package com.example.adventure.adventure.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// name, healthPoints, inventory (dictionary array list), attack method, change weapon
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
    @Column(name="startHealthPoints")
    private int startHealthPoints;

    @OneToOne
    @JoinColumn(name="weapon_id")
    @JsonIgnoreProperties({"player"})
    private Weapon weapon;

    @OneToMany(mappedBy="player", fetch=FetchType.LAZY)
    @JsonIgnoreProperties({"player"})
    private List<Potion> potions;



    public Player(int gold, String name, int healthPoints, int startHealthPoints, Weapon weapon){
        this.gold = gold;
        this.name = name;
        this.healthPoints = healthPoints;
        this.potions = new ArrayList<Potion>();
        this.startHealthPoints = startHealthPoints;
        this.weapon = weapon;
    }

    public int getStartHealthPoints() {
        return startHealthPoints;
    }

    public void setStartHealthPoints(int startHealthPoints) {
        this.startHealthPoints = startHealthPoints;
    }




    public int getPotions() {
        return potions.size();
    }

    public void setPotions(List<Potion> potions) {
        this.potions = potions;
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

    public void takeDamage(NPC npc) {

        this.healthPoints -= npc.getAttackValue();
    }

    public void healPlayer(Potion potion) {

        this.healthPoints += potion.getHealingPoints();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getWeaponAttackPoints() {
        return weapon.getAttackPoints();
    }

    public Player(){
    }



}
