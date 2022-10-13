package com.example.adventure.adventure;

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

    @BeforeEach
    public void before() {

        npc = new NPC("Vampire Lord", 80, 10, 100);
        weapon1 = new Weapon(15, "Axe of Death");
        player = new Player(20, "Aimee", 100, 100, weapon1);

    }

    @Test
    public void npcHasName() {assertEquals("Vampire Lord", npc.getName());}

    @Test
    public void npcHasHealthPoints() {assertEquals(80, npc.getHealthPoints());}

    @Test
    public void npcHasAttackValue() {assertEquals(10, npc.getAttackValue());}


}
