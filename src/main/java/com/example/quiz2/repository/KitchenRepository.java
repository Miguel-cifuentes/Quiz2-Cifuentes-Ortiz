package com.example.quiz2.repository;

import com.example.quiz2.entities.Kitchen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface KitchenRepository extends JpaRepository<Kitchen, Long> {
    Optional<Kitchen> findByChefId(Long chefId);
}
