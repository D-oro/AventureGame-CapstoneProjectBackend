package com.example.adventure.adventure.Controllers;
import com.example.adventure.adventure.models.GreenPotion;
import com.example.adventure.adventure.repositories.GreenPotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class GreenPotionController {

    @Autowired
    GreenPotionRepository greenPotionRepository;

    @GetMapping(value = "/greenpotions")
    public ResponseEntity<List<GreenPotion>> getAllGreenPotions(){
        return new ResponseEntity<>(greenPotionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/greenpotions/{id}")
    public ResponseEntity getGreenPotion(@PathVariable Long id)
    {
        return new ResponseEntity (greenPotionRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/greenpotions")
    public ResponseEntity<GreenPotion> postGreenPotion(@RequestBody GreenPotion greenpotion){
        greenPotionRepository.save(greenpotion);
        return new ResponseEntity<>(greenpotion, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/greenpotions/{id}")
    public ResponseEntity<GreenPotion> deleteGreenPotion(@PathVariable Long id){
        GreenPotion found = greenPotionRepository.findById(id).get();
        greenPotionRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PutMapping(value = "/greenpotions")
    public ResponseEntity<GreenPotion> updatePotion(@RequestBody GreenPotion greenpotion){
        greenPotionRepository.save(greenpotion);
        return new ResponseEntity<>(greenpotion, HttpStatus.OK);
    }
}
