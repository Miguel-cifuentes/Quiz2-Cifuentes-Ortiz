package com.example.quiz2.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String heroType;
    private String damageType;
    private String attackType;
    private Integer health;
    private Integer mana;
    private String gender;
}
}
