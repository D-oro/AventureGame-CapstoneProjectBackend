package com.example.adventure.adventure.repositories;

import com.example.adventure.adventure.models.Potion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface potionRepository extends JpaRepository<Potion, Long> {
}
