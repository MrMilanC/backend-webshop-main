package com.example.backendwebshopmain.repository;

import com.example.backendwebshopmain.model.TaxRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRateRepository extends JpaRepository<TaxRate, Long> {
    // noop
}