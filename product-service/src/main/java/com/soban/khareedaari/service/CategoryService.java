package com.soban.khareedaari.service;

import com.soban.khareedaari.domain.Category;
import com.soban.khareedaari.domain.Product;

import java.util.List;

public interface CategoryService {

    public Category save(final Category category);

    public List<Category> findAll();
}
