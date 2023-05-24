package com.soban.khareedaari.service.impl;

import com.soban.khareedaari.domain.Category;
import com.soban.khareedaari.domain.Product;
import com.soban.khareedaari.repository.CategoryRepository;
import com.soban.khareedaari.repository.ProductRepository;
import com.soban.khareedaari.service.CategoryService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public Category save(final Category category){
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
