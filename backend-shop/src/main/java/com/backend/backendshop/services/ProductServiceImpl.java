package com.backend.backendshop.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backendshop.models.entity.Product;
import com.backend.backendshop.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        return (List<Product>) repository.findAll();
    }
    
    

}
