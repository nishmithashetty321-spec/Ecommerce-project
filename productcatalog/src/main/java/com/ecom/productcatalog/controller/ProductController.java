package com.ecom.productcatalog.controller;

import com.ecom.productcatalog.model.product;
import com.ecom.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<product> allProducts() {
        return productService.allProducts();
    }

    @GetMapping("/category/{category_id}")
    public List<product> getProductById(@PathVariable("category_id") Long category_id) {
        return productService.getProductById(category_id);
    }
}
