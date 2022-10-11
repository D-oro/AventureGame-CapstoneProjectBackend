package com.example.adventure.adventure.components;

import com.example.adventure.adventure.models.*;
import com.example.adventure.adventure.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Profile("!Test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    NpcRepository npcRepository;

    @Autowired
    WeaponRepository weaponRepository;

    @Autowired
    PotionRepository potionRepository;

    @Autowired
    RoomRepository roomRepository;

    public DataLoader() {

    }


    public void run(ApplicationArguments args) {
        Player player1 = new Player(500, "Johnny", 100);
        playerRepository.save(player1);

        NPC npc1 = new NPC("The Protector", 50, 10);
        npcRepository.save(npc1);

        NPC npc2 = new NPC("Elving", 80, 10);
        npcRepository.save(npc2);

        NPC npc3 = new NPC("Yer Maw", 100, 60);
        npcRepository.save(npc3);

        Weapon weapon1 = new Weapon(15, "sword");
        weaponRepository.save(weapon1);

        Weapon weapon2 = new Weapon(25, "Axe");
        weaponRepository.save(weapon2);

        Weapon weapon3 = new Weapon(30, "Flail");
        weaponRepository.save(weapon3);

        Room room1 = new Room("Battle room", npc1);
        roomRepository.save(room1);

        Room room2 = new Room("Puzzle room", npc3);
        roomRepository.save(room2);

        Room room3 = new Room("Boss room", npc2);
        roomRepository.save(room3);

        Potion potion1 = new Potion("Love Potion", 50);
        potionRepository.save(potion1);

        Potion potion2 = new Potion("Risky potion", -60);
        potionRepository.save(potion2);

        Potion potion3 = new Potion("Risky potion", 35);
        potionRepository.save(potion3);
    }
}
