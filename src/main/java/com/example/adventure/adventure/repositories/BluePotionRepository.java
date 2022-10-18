package com.example.adventure.adventure.repositories;

import com.example.adventure.adventure.models.BluePotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BluePotionRepository extends JpaRepository<BluePotion, Long> {
}
