package com.junit.controller;

import com.junit.model.Product;
import com.junit.repository.ProductRepository;
import com.junit.service.ProductService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(controllers = ProductController.class)
public class ProductControllerTest {

    @InjectMocks
    ProductController productController;

//    @Mock
//    MockMvc mockMvc;

    @Autowired
    MockMvc mockMvc;

    @Mock
    ProductRepository productRepository;
    List<Product> productList;

    @BeforeAll
    public void beforeAll(){
        productList.add(new Product(1,"Apple","fruits",120,10));
        productList.add(new Product(2,"Orange0","fruits",80,90));
        productList.add(new Product(3,"Banana","fruits",20,100));
        productList.add(new Product(4,"Grapes","fruits",50,80));
        productList.add(new Product(5,"Milk","Dairy",30,40));

    }

    @Test
    public void createProductTest(){
        Product product=new Product(5,"Sapota","fruits",35,320);
       when(productRepository.save(product));
       this.mockMvc.perform(po)
    }
}
