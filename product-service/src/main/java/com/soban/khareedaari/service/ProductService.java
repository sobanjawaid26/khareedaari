package com.soban.khareedaari.service;

import com.soban.khareedaari.domain.Product;
import com.soban.khareedaari.dto.ProductDto;
import com.soban.khareedaari.repository.ProductRepository;

import java.util.List;

public interface ProductService {

    public Product save(final Product product);

    public List<Product> findAll();
}
