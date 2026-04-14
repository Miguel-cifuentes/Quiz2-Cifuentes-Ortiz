package com.example.quiz2.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "kitchens")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Kitchen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String restaurantName;
    private int capacity;

    @OneToOne
    @JoinColumn(name = "chef_id")
    private Chef chef;

}