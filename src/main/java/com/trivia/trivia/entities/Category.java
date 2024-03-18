package com.trivia.trivia.entities;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "category")
public class Category{
    @Id
    // auto increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
}
