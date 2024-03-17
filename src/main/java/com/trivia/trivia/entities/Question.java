package com.trivia.trivia.entities;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Question {
    private String category;
    private String question;
    private String[] options;
    private Integer answer;
    private String explanation;
}
