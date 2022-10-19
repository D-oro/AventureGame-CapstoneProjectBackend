package com.example.adventure.adventure.Controllers;
import com.example.adventure.adventure.models.RedPotion;
import com.example.adventure.adventure.repositories.RedPotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RedPotionController {

    @Autowired
    RedPotionRepository redPotionRepository;

    @GetMapping(value = "/redpotions")
    public ResponseEntity<List<RedPotion>> getAllRedPotions(){
        return new ResponseEntity<>(redPotionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/redpotions/{id}")
    public ResponseEntity getRedPotion(@PathVariable Long id)
    {
        return new ResponseEntity (redPotionRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/redpotions")
    public ResponseEntity<RedPotion> postRedPotion(@RequestBody RedPotion redpotion){
        redPotionRepository.save(redpotion);
        return new ResponseEntity<>(redpotion, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/redpotions/{id}")
    public ResponseEntity<RedPotion> deleteRedPotion(@PathVariable Long id){
        RedPotion found = redPotionRepository.findById(id).get();
        redPotionRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PutMapping(value = "/redpotions")
    public ResponseEntity<RedPotion> updateRedPotion(@RequestBody RedPotion redpotion){
        redPotionRepository.save(redpotion);
        return new ResponseEntity<>(redpotion, HttpStatus.OK);
    }
}
