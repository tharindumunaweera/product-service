package com.tharindumunaweera.productservice.repository;

import com.tharindumunaweera.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
