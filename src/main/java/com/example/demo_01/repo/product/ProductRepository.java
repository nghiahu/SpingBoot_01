package com.example.demo_01.repo.product;

import com.example.demo_01.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    void save(Product product);
    void update(Product product);
    void delete(Long id);
    Product findById(Long id);
}
