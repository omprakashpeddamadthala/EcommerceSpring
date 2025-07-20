package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.CategoryDTO;
import org.example.service.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final ICategoryService categoryService;

    @GetMapping
    public List<CategoryDTO> getAllCategories() throws IOException {
       return categoryService.getAllCategories();

    }

}
