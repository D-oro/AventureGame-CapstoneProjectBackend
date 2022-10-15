package com.example.adventure.adventure.Controllers;

import com.example.adventure.adventure.models.Riddles;
import com.example.adventure.adventure.repositories.RiddlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class RiddlesController {

    @Autowired
    RiddlesRepository riddlesRepository;

    @GetMapping(value = "/riddles")
    public ResponseEntity<List<Riddles>> getAllRiddles(){
        return new ResponseEntity<>(riddlesRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/riddles/{id}")
    public ResponseEntity getRiddles(@PathVariable Long id)
    {
        return new ResponseEntity (riddlesRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/riddles")
    public ResponseEntity<Riddles> postRiddle(@RequestBody Riddles riddles){
        riddlesRepository.save(riddles);
        return new ResponseEntity<>(riddles, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/riddles/{id}")
    public ResponseEntity<Riddles> deleteRiddles(@PathVariable Long id){
        Riddles found = riddlesRepository.findById(id).get();
        riddlesRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PutMapping(value = "/riddles")
    public ResponseEntity<Riddles> updateRiddles(@RequestBody Riddles riddles){
        riddlesRepository.save(riddles);
        return new ResponseEntity<>(riddles, HttpStatus.OK);
    }
}
