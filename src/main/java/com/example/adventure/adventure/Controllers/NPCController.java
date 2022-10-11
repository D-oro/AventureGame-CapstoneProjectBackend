package com.example.adventure.adventure.Controllers;

import com.example.adventure.adventure.models.NPC;
import com.example.adventure.adventure.repositories.NpcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NPCController {

    @Autowired
    NpcRepository npcRepository;

    @GetMapping(value = "/npcs")
    public ResponseEntity<List<NPC>> getAllNpcs() {
        return new ResponseEntity<>(npcRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/npcs/{id}")
    public ResponseEntity getNpc(@PathVariable Long id)
    {
        return new ResponseEntity (npcRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/npcs")
    public ResponseEntity<NPC> postNpc(@RequestBody NPC npc){
        npcRepository.save(npc);
        return new ResponseEntity<>(npc, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/npcs/{id}")
    public ResponseEntity<NPC> deleteNpc(@PathVariable Long id){
        NPC found = npcRepository.findById(id).get();
        npcRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PutMapping(value = "/npcs")
    public ResponseEntity<NPC> updateNpc(@RequestBody NPC npc){
        npcRepository.save(npc);
        return new ResponseEntity<>(npc, HttpStatus.OK);
    }

}
