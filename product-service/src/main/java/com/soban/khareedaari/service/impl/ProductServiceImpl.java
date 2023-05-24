package com.soban.khareedaari.service.impl;

import com.soban.khareedaari.domain.Product;
import com.soban.khareedaari.dto.ProductDto;
import com.soban.khareedaari.repository.ProductRepository;
import com.soban.khareedaari.service.ProductService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public Product save(final Product product){
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
