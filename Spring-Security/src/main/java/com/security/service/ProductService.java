package com.security.service;

import com.security.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product save(Product product);
}
