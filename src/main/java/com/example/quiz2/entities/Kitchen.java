package com.example.quiz2.entities;

import jakarta.persistence.*;

@Entity
public class Kitchen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String restaurantName;
    private int capacity;

    @OneToOne
    @JoinColumn(name = "chef_id")
    private Chef chef;

    // getters y setters
}