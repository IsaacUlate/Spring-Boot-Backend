package com.backend.backendshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.backend.backendshop.models.entity.Product;
import java.util.List;
import com.backend.backendshop.services.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> list(){
        return service.findAll();
    }

}
