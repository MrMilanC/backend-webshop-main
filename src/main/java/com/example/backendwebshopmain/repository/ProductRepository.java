package com.example.backendwebshopmain.repository;

import com.example.backendwebshopmain.model.Category;
import com.example.backendwebshopmain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import jakarta.persistence.Id;
import org.springframework.stereotype.Repository;

/**
 * {@link JpaRepository} für {@link Product Produkte}.
 * Der erste Generic, hier {@link Product},
 * gibt die Entität an, die das Repository verwaltet.
 * Der zweite Generic, hier {@link Long},
 * gibt den Datentyp des Primary Keys der Entität an.
 * Das ist die Variable, welche wir mit {@link Id} annotiert haben.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByType(String type);

    /*public List<Product> findProductsByCategory(Category category);

    public List<Product> findProductsByPriceBefore(Integer price);*/
}
