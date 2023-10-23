package com.backend.backendshop.repositories;

import org.springframework.data.repository.CrudRepository;

import com.backend.backendshop.models.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Long>{
    
}
