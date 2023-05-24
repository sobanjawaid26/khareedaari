package com.soban.khareedaari.repository;

import com.soban.khareedaari.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
