package com.ecom.productcatalog.service;

import com.ecom.productcatalog.Repository.ProductRepository;
import com.ecom.productcatalog.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<product> allProducts() {
        return productRepository.findAll();
    }

    public List<product> getProductById(Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }
}
