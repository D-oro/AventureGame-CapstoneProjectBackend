package com.example.adventure.adventure.Controllers;

import com.example.adventure.adventure.models.Room;
import com.example.adventure.adventure.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
