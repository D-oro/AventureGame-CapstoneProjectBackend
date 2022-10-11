package com.example.adventure.adventure;

import com.example.adventure.adventure.models.NPC;
import com.example.adventure.adventure.models.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomTest {

    Room room;

    NPC npc;

    @BeforeEach
    public void before() {
        npc = new NPC("The Projector", 60, 8);
        room = new Room("Puzzle Room", npc);
    }

    @Test
    public void roomHasName() {assertEquals("Puzzle Room", room.getName());}

    @Test
    public void roomHasNpc() {assertEquals(npc, room.getNpc());}
}
