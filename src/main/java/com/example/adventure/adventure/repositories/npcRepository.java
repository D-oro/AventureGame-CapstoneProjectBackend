package com.example.adventure.adventure.repositories;

import com.example.adventure.adventure.models.NPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface npcRepository extends JpaRepository<NPC, Long> {
}
