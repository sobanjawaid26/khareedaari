package com.soban.khareedaari.repository;

import com.soban.khareedaari.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
