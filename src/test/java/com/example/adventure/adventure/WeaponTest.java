package com.example.adventure.adventure;

import com.example.adventure.adventure.models.Weapon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WeaponTest {

    Weapon weapon;

    @BeforeEach
    public void before() {
        weapon = new Weapon(15, "Bastard Sword");
    }

    @Test
    public void weaponHasName() {assertEquals("Bastard Sword", weapon.getName());}

    @Test
    public void weaponHasAttackPoints() {assertEquals(15, weapon.getAttackPoints());}







}
