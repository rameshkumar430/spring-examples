package com.junit.service;

import com.junit.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);

    List<Product> getAll();
}
