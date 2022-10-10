package com.example.adventure.adventure.models;
// enemy, treasure, puzzle

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="rooms")
public class Room {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;

    @OneToOne
    @JoinColumn(name="npc_id", nullable = false)
    @JsonIgnoreProperties({"rooms"})
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Room(){
    }

}
