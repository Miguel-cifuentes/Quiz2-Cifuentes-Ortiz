package com.example.quiz2.Dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChefProfileDto {

    private String name;
    private String specialization;
    private int age;

    private String restaurantName;
    private int capacity;
}
