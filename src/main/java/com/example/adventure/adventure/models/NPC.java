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

    @OneToOne
    @JoinColumn(name="room_id")
    @JsonIgnoreProperties({"npc"})
    private Room room;

    public NPC(String name, int healthPoints, int attackValue){
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackValue = attackValue;
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

    public NPC(){
    }
}
