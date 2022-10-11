package com.example.adventure.adventure;

import com.example.adventure.adventure.models.NPC;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NPCTest {

    NPC npc;

    @BeforeEach
    public void before() {
        npc = new NPC("Vampire Lord", 80, 10);
    }

    @Test
    public void npcHasName() {assertEquals("Vampire Lord", npc.getName());}

    @Test
    public void npcHasHealthPoints() {assertEquals(80, npc.getHealthPoints());}

    @Test
    public void npcHasAttackValue() {assertEquals(10, npc.getAttackValue());}
}
