package com.backend.backendshop.services;
import com.backend.backendshop.models.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> findAll();

}
