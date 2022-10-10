package com.example.adventure.adventure.Controllers;

import com.example.adventure.adventure.models.NPC;
import com.example.adventure.adventure.repositories.NpcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NPCController {

    @Autowired
    NpcRepository npcRepository;

    @GetMapping(value = "/npcs")
    public ResponseEntity<List<NPC>> getAllNpcs() {
        return new ResponseEntity<>(npcRepository.findAll(), HttpStatus.OK);
    }

}
