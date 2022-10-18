package com.example.adventure.adventure.Controllers;
import com.example.adventure.adventure.models.YellowPotion;
import com.example.adventure.adventure.repositories.YellowPotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class YellowPotionController {

    @Autowired
    YellowPotionRepository yellowPotionRepository;

    @GetMapping(value = "/yellowpotions")
    public ResponseEntity<List<YellowPotion>> getAllYellowPotions(){
        return new ResponseEntity<>(yellowPotionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/yellowpotions/{id}")
    public ResponseEntity getYellowPotion(@PathVariable Long id)
    {
        return new ResponseEntity (yellowPotionRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/yellowpotions")
    public ResponseEntity<YellowPotion> postYellowPotion(@RequestBody YellowPotion yellowpotion){
        yellowPotionRepository.save(yellowpotion);
        return new ResponseEntity<>(yellowpotion, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/yellowpotions/{id}")
    public ResponseEntity<YellowPotion> deleteYellowPotion(@PathVariable Long id){
        YellowPotion found = yellowPotionRepository.findById(id).get();
        yellowPotionRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PutMapping(value = "/yellowpotions")
    public ResponseEntity<YellowPotion> updatePotion(@RequestBody YellowPotion yellowpotion){
        yellowPotionRepository.save(yellowpotion);
        return new ResponseEntity<>(yellowpotion, HttpStatus.OK);
    }
}
