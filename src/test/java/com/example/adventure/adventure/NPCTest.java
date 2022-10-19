package com.example.adventure.adventure;
import com.example.adventure.adventure.models.RedPotion;
import com.example.adventure.adventure.models.YellowPotion;
import com.example.adventure.adventure.models.BluePotion;
import com.example.adventure.adventure.models.GreenPotion;
import com.example.adventure.adventure.models.NPC;
import com.example.adventure.adventure.models.Player;
import com.example.adventure.adventure.models.Weapon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NPCTest {

    NPC npc;

    Player player;

    Weapon weapon1;

    RedPotion redPotion;
    YellowPotion yellowPotion;
    BluePotion bluePotion;
    GreenPotion greenPotion;

    @BeforeEach
    public void before() {
        redPotion = new RedPotion("Love Potion", 25);
        yellowPotion = new YellowPotion("Sunshine Potion", 35);
        bluePotion = new BluePotion("Sky Potion", 45);
        greenPotion = new GreenPotion("Herbal Potion", 55);
        npc = new NPC("Vampire Lord", 80, 10, 100);
        weapon1 = new Weapon(15, "Axe of Death");
        player = new Player(1, 20, "Aimee", 100, 100, weapon1, redPotion, yellowPotion, bluePotion, greenPotion);

    }

    @Test
    public void npcHasName() {assertEquals("Vampire Lord", npc.getName());}

    @Test
    public void npcHasHealthPoints() {assertEquals(80, npc.getHealthPoints());}

    @Test
    public void npcHasAttackValue() {assertEquals(10, npc.getAttackValue());}


}
