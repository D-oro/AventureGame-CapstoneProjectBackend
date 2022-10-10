package com.example.adventure.adventure.Controllers;

import com.example.adventure.adventure.models.Potion;
import com.example.adventure.adventure.repositories.PotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PotionController {

    @Autowired
    PotionRepository potionRepository;

    @GetMapping(value = "/potions")
    public ResponseEntity<List<Potion>> getAllPotions(){
        return new ResponseEntity<>(potionRepository.findAll(), HttpStatus.OK);
    }
}
