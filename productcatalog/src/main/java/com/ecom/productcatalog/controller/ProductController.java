package com.ecom.productcatalog.controller;

import com.ecom.productcatalog.model.product;
import com.ecom.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins="http://localhost:5173")
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
