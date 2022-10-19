package com.example.adventure.adventure.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// name, healthPoints, startHealthPoints, weapon, redPotion, yellowPotion, greenPotion, bluePotion, gold
@Entity
@Table(name="players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="level")
    private int level;

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
    @JsonIgnoreProperties(value={"player"},allowSetters = true)
    private Weapon weapon;

    @OneToOne
    @JoinColumn(name="redpotion_id")
    @JsonIgnoreProperties(value={"player"},allowSetters = true)
    private RedPotion redPotion;

    @OneToOne
    @JoinColumn(name="yellowpotion_id")
    @JsonIgnoreProperties(value={"player"},allowSetters = true)
    private YellowPotion yellowPotion;

    @OneToOne
    @JoinColumn(name="bluepotion_id")
    @JsonIgnoreProperties(value={"player"},allowSetters = true)
    private BluePotion bluePotion;

    @OneToOne
    @JoinColumn(name="greenpotion_id")
    @JsonIgnoreProperties(value={"player"},allowSetters = true)
    private GreenPotion greenPotion;

    public Player(int level, int gold, String name, int healthPoints, int startHealthPoints, Weapon weapon, RedPotion redPotion, YellowPotion yellowPotion, BluePotion bluePotion, GreenPotion greenPotion){
        this.level = level;
        this.gold = gold;
        this.name = name;
        this.healthPoints = healthPoints;
        this.startHealthPoints = startHealthPoints;
        this.weapon = weapon;
        this.redPotion = redPotion;
        this.yellowPotion = yellowPotion;
        this.greenPotion = greenPotion;
        this.bluePotion = bluePotion;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public GreenPotion getGreenPotion() {
        return greenPotion;
    }

    public void setGreenPotion(GreenPotion greenPotion) {
        this.greenPotion = greenPotion;
    }

    public BluePotion getBluePotion() {
        return bluePotion;
    }

    public void setBluePotion(BluePotion bluePotion) {
        this.bluePotion = bluePotion;
    }

    public YellowPotion getYellowPotion() {
        return yellowPotion;
    }

    public void setYellowPotion(YellowPotion yellowPotion) {
        this.yellowPotion = yellowPotion;
    }

    public RedPotion getRedPotion() {
        return redPotion;
    }

    public void setRedPotion(RedPotion redPotion) {
        this.redPotion = redPotion;
    }

    public int getStartHealthPoints() {
        return startHealthPoints;
    }

    public void setStartHealthPoints(int startHealthPoints) {
        this.startHealthPoints = startHealthPoints;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

//    public void healPlayer(Potion potion) {
//
//        this.healthPoints += potion.getHealingPoints();
//    }

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






























