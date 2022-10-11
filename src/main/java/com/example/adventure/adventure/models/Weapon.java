package com.example.adventure.adventure.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="weapons")
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="attack_points")
    private int attackPoints;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="player_id")

    @JsonIgnoreProperties({"weapons"})
    private Player player;


    public Weapon(int attackPoints, String name){
        this.attackPoints = attackPoints;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setId(Long id) {
        this.id = id;
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
