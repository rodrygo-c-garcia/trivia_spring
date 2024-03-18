package com.trivia.trivia.controllers;

import com.trivia.trivia.entities.Category;
import com.trivia.trivia.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TriviaController {
    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/category")
    public Category getCategoryById(@RequestParam("id") Long id){
        return categoryRepository.getById(id);
    }

    @PostMapping("/category")
    public String createCategory(@RequestBody Category category){
        return categoryRepository.create(category);
    }
}
