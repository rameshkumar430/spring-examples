package com.junit.controller;

import com.junit.model.Product;
import com.junit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService prodcutService;

    @PostMapping("/save")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        Product saveProduct = prodcutService.createProduct(product);
        return ResponseEntity.ok().body(prodcutService.createProduct(product));
    }

    @GetMapping("/all")
    public List<Product> getAll(){
        return prodcutService.getAll();
    }

}
