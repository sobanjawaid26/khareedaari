package com.soban.khareedaari.resource;

import com.soban.khareedaari.domain.Category;
import com.soban.khareedaari.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryResource {

    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.ok(categoryService.findAll());
    }


    @PostMapping
    public ResponseEntity<Category> save(
            @RequestBody
            final Category category) {
        return ResponseEntity.ok(this.categoryService.save(category));
    }
}
