package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FakeStoreProductsByCategoryResponseDTO {
    private String message;
    private String status;
    private List<String>  products;
}
