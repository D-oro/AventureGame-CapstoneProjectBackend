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

    @Autowired
    RiddlesRepository riddlesRepository;

    public DataLoader() {

    }


    public void run(ApplicationArguments args) {

        Weapon weapon1 = new Weapon(15, "sword");
        weaponRepository.save(weapon1);

        Weapon weapon2 = new Weapon(15, "Axe");
        weaponRepository.save(weapon2);

        Weapon weapon3 = new Weapon(15, "Flail");
        weaponRepository.save(weapon3);

        Player player1 = new Player(500, "Johnny", 150, 150, weapon1);
        playerRepository.save(player1);

        Potion potion1 = new Potion("Love Potion", 50, player1);
        potionRepository.save(potion1);

        Potion potion2 = new Potion("Yellow potion", 35, player1);
        potionRepository.save(potion2);

//        Potion potion3 = new Potion("Risky potion", -60, player1);
//        potionRepository.save(potion3);

        NPC npc1 = new NPC("The Punisher", 200, 10, 200);
        npcRepository.save(npc1);

        NPC npc2 = new NPC("The Orc of Tomorrow", 250, 11, 250);
        npcRepository.save(npc2);

        NPC npc3 = new NPC("Trolling Me, Trolling You", 260, 12, 260);
        npcRepository.save(npc3);

        NPC npc4 = new NPC("For chicken in chickens", 300, 13, 300);
        npcRepository.save(npc4);

        Room room1 = new Room("Battle room", npc1);
        roomRepository.save(room1);

        Room room2 = new Room("Puzzle room", npc3);
        roomRepository.save(room2);

        Room room3 = new Room("Boss room", npc2);
        roomRepository.save(room3);

        Riddles riddle1 = new Riddles("What has to be broken before it can be used?", "An Egg", "A pen", "A problem", "A house");
        riddlesRepository.save(riddle1);

        Riddles riddle2 = new Riddles("I'm tall when i'm young, and short when i'm old... What am I?", "A candle", "A child", "A dog", "An apricot");
        riddlesRepository.save(riddle2);

        Riddles riddle3 = new Riddles("If two's a company and three's a crowd, what is 4 and 5?", "Nine", "Fourteens a mess", "4 add 5", "There isn't a phrase for 4 and 5");
        riddlesRepository.save(riddle3);

        Riddles riddle4 = new Riddles("The more you code, the more of me there is. I may be gone for now, but I'll never be gone forever. What am I?", "A bug", "A consoleLog", "An Error Message", "A Unit Test");
        riddlesRepository.save(riddle4);

    }
}
