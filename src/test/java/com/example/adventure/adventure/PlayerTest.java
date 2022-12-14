package com.example.adventure.adventure;

import com.example.adventure.adventure.models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    Player player;

    Weapon weapon1;

    YellowPotion yellowPotion;
    RedPotion redPotion;
    GreenPotion greenPotion;
    BluePotion bluePotion;


    NPC npc1;

    @BeforeEach
    public void before() {
        weapon1 = new Weapon(15, "Axe of Death");
        redPotion = new RedPotion("Love Potion", 25);
        yellowPotion = new YellowPotion("Sunshine Potion", 35);
        bluePotion = new BluePotion ("Sky Potion", 45);
        greenPotion = new GreenPotion ("Herbal Potion", 55);
        player = new Player(1, 20, "Aimee", 100, 100, weapon1, redPotion, yellowPotion, bluePotion, greenPotion);
        npc1 = new NPC("Crazy Chicken", 75, 10, 100);
    }

    @Test
    public void playerHasGold() {assertEquals(20,player.getGold());}

    @Test
    public void playerHasAName() {assertEquals("Aimee", player.getName());}

    @Test
    public void playerHasHealthPoints() {assertEquals(100, player.getHealthPoints());}


//    @Test
//    public void canGetWeaponAttackDamage() {
//        player.addWeapon(weapon1);
////        assertEquals(15, player.getAttackPointsOfFirstWeaponInArray());
//    }

//    @Test
//    public void canGetPotionHealingAmount() {
//        player.addPotion(potion1);
//        assertEquals(20, player.getHealingPointsOfFirstPotionInArray());
//    }

//    @Test
//    public void canTakeDamageFromNpc() {
//        player.takeDamage(npc1);
//        assertEquals(90, player.getHealthPoints());
//    }

//    @Test
//    public void canHealUsingPotion() {
//        player.takeDamage(npc1);
//        player.takeDamage(npc1);
//        player.healPlayer(potion1);
//        assertEquals(100, player.getHealthPoints());
//    }
}
