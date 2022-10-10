package com.example.adventure.adventure.repositories;

import com.example.adventure.adventure.models.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface weaponRepository extends JpaRepository<Weapon, Long> {
}
