package com.example.quiz2.service;

import com.example.quiz2.entities.Kitchen;
import com.example.quiz2.repository.KitchenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KitchenService {

    private final KitchenRepository kitchenRepository;

    public List<Kitchen> getAllKitchens() {
        return kitchenRepository.findAll();
    }
}
