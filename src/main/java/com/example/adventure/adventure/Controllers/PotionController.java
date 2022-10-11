package com.example.adventure.adventure.Controllers;

import com.example.adventure.adventure.models.NPC;
import com.example.adventure.adventure.models.Player;
import com.example.adventure.adventure.models.Potion;
import com.example.adventure.adventure.repositories.PotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PotionController {

    @Autowired
    PotionRepository potionRepository;

    @GetMapping(value = "/potions")
    public ResponseEntity<List<Potion>> getAllPotions(){
        return new ResponseEntity<>(potionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/potions/{id}")
    public ResponseEntity getPotion(@PathVariable Long id)
    {
        return new ResponseEntity (potionRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/potions")
    public ResponseEntity<Potion> postPotion(@RequestBody Potion potion){
        potionRepository.save(potion);
        return new ResponseEntity<>(potion, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/potions/{id}")
    public ResponseEntity<Potion> deletePotion(@PathVariable Long id){
        Potion found = potionRepository.findById(id).get();
        potionRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PutMapping(value = "/potions")
    public ResponseEntity<Potion> updatePotion(@RequestBody Potion potion){
        potionRepository.save(potion);
        return new ResponseEntity<>(potion, HttpStatus.OK);
    }
}
