package com.example.quiz2.Dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KitchenDto {

    private Long id;
    private String restaurantName;
    private int capacity;
    private Long chefId;
}