package com.example.adventure.adventure.repositories;

import com.example.adventure.adventure.models.GreenPotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreenPotionRepository extends JpaRepository<GreenPotion, Long> {
}
