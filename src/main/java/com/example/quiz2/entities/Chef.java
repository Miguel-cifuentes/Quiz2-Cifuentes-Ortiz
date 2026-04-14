package com.example.quiz2.entities;

import jakarta.persistence.*;

@Entity
public class Chef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;
    private int age;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(mappedBy = "chef")
    private Kitchen kitchen;

    // getters y setters
}