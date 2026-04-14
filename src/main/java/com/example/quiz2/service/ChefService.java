package com.example.quiz2.service;

import com.example.quiz2.Dto.ChefProfileDto;
import com.example.quiz2.entities.Chef;
import com.example.quiz2.repository.ChefRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChefService {

    private final ChefRepository chefRepository;

    public ChefProfileDto getMyProfile() {

        String username = SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getName();

        Chef chef = chefRepository.findByUserUsername(username)
                .orElseThrow(() -> new RuntimeException("Chef no encontrado"));

        if (chef.getKitchen() == null) {
            throw new RuntimeException("El chef no tiene cocina asignada");
        }

        return new ChefProfileDto(
                chef.getName(),
                chef.getSpecialization(),
                chef.getAge(),
                chef.getKitchen().getRestaurantName(),
                chef.getKitchen().getCapacity()
        );
    }
}