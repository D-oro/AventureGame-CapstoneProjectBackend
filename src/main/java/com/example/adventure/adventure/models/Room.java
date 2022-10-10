package com.example.adventure.adventure.models;
// enemy, treasure, puzzle

public class Room {

    private String name;

    private NPC npc;

    public Room (String name, NPC npc){
        this.name = name;
        this.npc = npc;
    }

    public NPC getNpc() {
        return npc;
    }

    public void setNpc(NPC npc) {
        this.npc = npc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room(){
    }

}
