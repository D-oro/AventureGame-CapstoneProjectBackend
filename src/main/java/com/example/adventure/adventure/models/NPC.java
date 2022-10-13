package com.example.adventure.adventure.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="npc")
public class NPC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="healthPoints")
    private int healthPoints;

    @Column(name="attackValue")
    private int attackValue;
    @Column(name="StartHealthPoints")
    private int startHealthPoints;

    @OneToOne
    @JoinColumn(name="room_id")
    @JsonIgnoreProperties({"npc"})
    private Room room;

    public NPC(String name, int healthPoints, int attackValue, int startHealthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackValue = attackValue;
        this.startHealthPoints = startHealthPoints;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getStartHealthPoints() {
        return startHealthPoints;
    }

    public void setStartHealthPoints(int startHealthPoints) {
        this.startHealthPoints = startHealthPoints;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void takeDamage(Player player) {
        this.healthPoints -= player.getAttackPointsOfFirstWeaponInArray();
    }

    public NPC(){
    }
}
