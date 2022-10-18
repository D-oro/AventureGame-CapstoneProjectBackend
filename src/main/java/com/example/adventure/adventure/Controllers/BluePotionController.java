package com.example.adventure.adventure.Controllers;
import com.example.adventure.adventure.models.BluePotion;
import com.example.adventure.adventure.models.BluePotion;
import com.example.adventure.adventure.models.BluePotion;
import com.example.adventure.adventure.repositories.BluePotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BluePotionController {

    @Autowired
    BluePotionRepository bluePotionRepository;

    @GetMapping(value = "/bluepotions")
    public ResponseEntity<List<BluePotion>> getAllBluePotions(){
        return new ResponseEntity<>(bluePotionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/bluepotions/{id}")
    public ResponseEntity getBluePotion(@PathVariable Long id)
    {
        return new ResponseEntity (bluePotionRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/bluepotions")
    public ResponseEntity<BluePotion> postBluePotion(@RequestBody BluePotion bluepotion){
        bluePotionRepository.save(bluepotion);
        return new ResponseEntity<>(bluepotion, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/bluepotions/{id}")
    public ResponseEntity<BluePotion> deleteBluePotion(@PathVariable Long id){
        BluePotion found = bluePotionRepository.findById(id).get();
        bluePotionRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PutMapping(value = "/bluepotions")
    public ResponseEntity<BluePotion> updatePotion(@RequestBody BluePotion bluepotion){
        bluePotionRepository.save(bluepotion);
        return new ResponseEntity<>(bluepotion, HttpStatus.OK);
    }
}
