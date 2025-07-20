package org.example.config;

import org.example.gateway.api.FakeStoreCategoryApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetroConfig {

    @Bean
    Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl( "https://fakestoreapi.in/api/" )
                .addConverterFactory( GsonConverterFactory.create() )
                .build();
    }

    @Bean
    FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit) {
        return retrofit.create(FakeStoreCategoryApi.class);
    }

}
