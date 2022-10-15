package com.example.adventure.adventure.repositories;

import com.example.adventure.adventure.models.Riddles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiddlesRepository extends JpaRepository<Riddles, Long> {
}
