package com.example.adventure.adventure.repositories;
import com.example.adventure.adventure.models.YellowPotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YellowPotionRepository extends JpaRepository<YellowPotion, Long> {
}
