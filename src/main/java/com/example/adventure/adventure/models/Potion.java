package com.example.adventure.adventure.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="potions")
public class Potion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="healingPoints")
    private int healingPoints;


    public Potion(String name, int healingPoints){
        this.name = name;
        this.healingPoints = healingPoints;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
