package com.bdr.service;

import com.bdr.model.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(String name);

    Product addProduct(Product product) ;


    void updateProduct(Product product);
    void deleteProduct(String name);

    List<Product> getProducts();
}
