package org.example.gateway;

import org.example.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {

    List<CategoryDTO> getCategories() throws IOException;
}
