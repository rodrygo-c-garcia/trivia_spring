package com.trivia.trivia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Question {
    private Long id;
    private String category;
    private String question;
    private String[] options;
    private Integer answer;
    private String explanation;
}
