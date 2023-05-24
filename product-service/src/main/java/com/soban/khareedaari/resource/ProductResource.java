package com.soban.khareedaari.resource;

import com.soban.khareedaari.domain.Product;
import com.soban.khareedaari.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductResource {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.ok(productService.findAll());
    }

    @PostMapping
    public ResponseEntity<Product> save(
            @RequestBody
            final Product product) {
        return ResponseEntity.ok(this.productService.save(product));
    }
}
