package org.example.gateway.api;

import org.example.dto.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;

@Component
public interface FakeStoreCategoryApi {

    @GET("products/category")
    Call<FakeStoreCategoryResponseDTO> getFakeStoreCategories();
}
