package com.example.adventure.adventure.Controllers;

import com.example.adventure.adventure.models.Weapon;
import com.example.adventure.adventure.repositories.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeaponController {

    @Autowired
    WeaponRepository weaponRepository;

    @GetMapping(value = "/weapons")
    public ResponseEntity<List<Weapon>> getAllWeapons(){

        return new ResponseEntity<>(weaponRepository.findAll(), HttpStatus.OK);
    }

}
