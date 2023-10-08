package com.geekster.WeeklyTest8102023.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ID;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne
    @JoinColumn(name = "fk_laptop_student")
    private Student student;
}
