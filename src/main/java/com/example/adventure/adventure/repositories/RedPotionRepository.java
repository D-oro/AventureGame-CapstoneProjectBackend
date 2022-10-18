package com.example.adventure.adventure.repositories;

import com.example.adventure.adventure.models.RedPotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedPotionRepository extends JpaRepository<RedPotion, Long> {
}
