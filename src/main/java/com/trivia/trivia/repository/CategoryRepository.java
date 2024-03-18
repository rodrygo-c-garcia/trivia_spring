package com.trivia.trivia.repository;

import com.trivia.trivia.entities.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TransactionRequiredException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class CategoryRepository {
    @PersistenceContext
    EntityManager entityManager;

    public List<Category> getAll(){
//        entityManager.get
        return null;
    }

    public Category getById(Long id){
        try {
            return entityManager.find(Category.class, id);
        } catch (NoResultException e){
            return null;
        }
    }

    public String create(Category category){
        try {
            entityManager.persist(category);
            return "Category created";
        } catch (IllegalArgumentException e){
            return "Category not created";
        } catch (TransactionRequiredException e){
            return "Error: No transaction active";
        }
    }
}
