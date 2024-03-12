package com.bdr.service;

import com.bdr.model.Product;

public interface ProductService {
    void getProduct(Product product);

    void setProduct(Product product, int id, String name, float price, String category) ;


    void updateProduct(Product product);
    void deleteProduct(Product product);
}
