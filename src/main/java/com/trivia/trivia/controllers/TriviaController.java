package com.trivia.trivia.controllers;

import com.trivia.trivia.entities.Category;
import com.trivia.trivia.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TriviaController {
    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/question/{category}")
    public Category getCategory(@PathVariable Long category){
        List<Category> categories = new ArrayList<>();
        categories.add(categoryRepository.getById(category));

        return categories.get(0);
    }
}
