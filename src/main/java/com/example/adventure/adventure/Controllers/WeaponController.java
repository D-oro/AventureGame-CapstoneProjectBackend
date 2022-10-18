package com.example.adventure.adventure.Controllers;

import com.example.adventure.adventure.models.Weapon;
import com.example.adventure.adventure.repositories.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WeaponController {

    @Autowired
    WeaponRepository weaponRepository;

    @GetMapping(value = "/weapons")
    public ResponseEntity<List<Weapon>> getAllWeapons(){

        return new ResponseEntity<>(weaponRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/weapons/{id}")
    public ResponseEntity getWeapon(@PathVariable Long id)
    {
        return new ResponseEntity (weaponRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/weapons")
    public ResponseEntity<Weapon> postWeapon(@RequestBody Weapon weapon){
        weaponRepository.save(weapon);
        return new ResponseEntity<>(weapon, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/weapons/{id}")
    public ResponseEntity<Weapon> deleteWeapon(@PathVariable Long id){
        Weapon found = weaponRepository.findById(id).get();
        weaponRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PutMapping(value = "/weapons")
    public ResponseEntity<Weapon> updateWeapon(@RequestBody Weapon weapon){
        weaponRepository.save(weapon);
        return new ResponseEntity<>(weapon, HttpStatus.OK);
    }

}
