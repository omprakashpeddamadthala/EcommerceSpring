package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.CategoryDTO;
import org.example.gateway.FakeStoreCategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FakeStoreCategoryService implements ICategoryService {

    private final FakeStoreCategoryGateway fakeStoreCategoryGateway;

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return fakeStoreCategoryGateway.getCategories();
    }
}
