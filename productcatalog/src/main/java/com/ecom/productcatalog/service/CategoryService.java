package com.ecom.productcatalog.service;

import com.ecom.productcatalog.Repository.CategoryRespository;
import com.ecom.productcatalog.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRespository categoryrepo;

    public List<Category> getAllCategories() {
        return categoryrepo.findAll();
    }
}
