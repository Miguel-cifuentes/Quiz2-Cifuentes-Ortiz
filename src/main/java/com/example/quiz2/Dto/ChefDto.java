package com.example.quiz2.Dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChefDto {

    private Long id;
    private String name;
    private String specialization;
    private int age;
    private String username;
}