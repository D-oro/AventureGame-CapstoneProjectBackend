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

        NPC npc1 = new NPC("The Projector", 50, 10);
        npcRepository.save(npc1);

        Weapon weapon1 = new Weapon(15, "sword");
        weaponRepository.save(weapon1);

        Room room1 = new Room("Attack room", npc1);
        roomRepository.save(room1);

        Potion potion1 = new Potion("Love Potion", 50);
        potionRepository.save(potion1);
    }
}
