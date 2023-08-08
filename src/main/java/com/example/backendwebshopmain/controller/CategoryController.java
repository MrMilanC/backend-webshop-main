package com.example.backendwebshopmain.controller;

import com.example.backendwebshopmain.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.backendwebshopmain.repository.CategoryRepository;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired //erstellt automatisch Repository
    private CategoryRepository categRepo;

    @PostMapping("/create")
    public Category createCategory(@RequestBody Category category) {
        categRepo.save(category);
        return category;
    }

    @GetMapping ("/get")
    public List<Category> getAllCategories() {
        return categRepo.findAll();
    }

}