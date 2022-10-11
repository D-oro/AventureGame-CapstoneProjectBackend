package com.example.adventure.adventure.Controllers;

import com.example.adventure.adventure.models.Potion;
import com.example.adventure.adventure.models.Room;
import com.example.adventure.adventure.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.Root;
import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomRepository roomRepository;

    @GetMapping(value = "/Rooms")
    public ResponseEntity<List<Room>> getAllRooms() {
        return new ResponseEntity<>(roomRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/rooms/{id}")
    public ResponseEntity getRoom(@PathVariable Long id)
    {
        return new ResponseEntity (roomRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/rooms")
    public ResponseEntity<Room> postRoom(@RequestBody Room room){
        roomRepository.save(room);
        return new ResponseEntity<>(room, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/rooms/{id}")
    public ResponseEntity<Room> deleteRoom(@PathVariable Long id){
        Room found = roomRepository.findById(id).get();
        roomRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PutMapping(value = "/rooms")
    public ResponseEntity<Room> updateRoom(@RequestBody Room room){
        roomRepository.save(room);
        return new ResponseEntity<>(room, HttpStatus.OK);
    }
}
