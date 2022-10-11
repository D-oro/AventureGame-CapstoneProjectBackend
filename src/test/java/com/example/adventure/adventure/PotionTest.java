package com.example.adventure.adventure;

import com.example.adventure.adventure.models.Potion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PotionTest {

    Potion potion;

    @BeforeEach
    public void before() {
        potion = new Potion("Health Potion", 30);
    }

    @Test
    public void potionHasName() {assertEquals("Health Potion", potion.getName());}

    @Test
    public void potionHasHealingPoints() {assertEquals(30, potion.getHealingPoints());}
}
