package com.tharindumunaweera.productservice.service;

import com.tharindumunaweera.productservice.dto.ProductRequest;
import com.tharindumunaweera.productservice.model.Product;
import com.tharindumunaweera.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
    }
}
