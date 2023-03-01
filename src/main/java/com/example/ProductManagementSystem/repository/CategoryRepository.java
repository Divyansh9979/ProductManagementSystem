package com.example.ProductManagementSystem.repository;

import com.example.ProductManagementSystem.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
