package org.example.gateway;

import lombok.RequiredArgsConstructor;
import org.example.dto.CategoryDTO;
import org.example.dto.FakeStoreCategoryResponseDTO;
import org.example.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class FakeStoreCategoryGateway implements ICategoryGateway {

    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    @Override
    public List<CategoryDTO> getCategories() throws IOException {
        FakeStoreCategoryResponseDTO responseDTO = this.fakeStoreCategoryApi.getFakeStoreCategories().execute().body();
        if (responseDTO == null) {
            throw new IOException("FakeStoreCategoryApi.getFakeStoreCategories() returned null");
        }
        return responseDTO.getCategories()
                .stream().map( categoryDTO -> CategoryDTO.builder()
                        .name( categoryDTO )
                        .build() )
                .collect( Collectors.toList());
    }
}
