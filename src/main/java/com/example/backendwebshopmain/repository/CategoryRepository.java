package com.example.backendwebshopmain.repository;

import com.example.backendwebshopmain.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
