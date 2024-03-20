package com.brd.controller;

import com.bdr.model.Product;
import com.bdr.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
    @GetMapping("/products")
    public List<Product> getProducts() throws IllegalAccessException {
        return productService.getProducts();
    }
    @GetMapping("/products/{name}")
    public Product getProduct(@PathVariable("name") String name) {
        return productService.getProduct(name);
    }
    @DeleteMapping("/products/{name}")
    public void deleteProduct(@PathVariable("name") String name){
         productService.deleteProduct(name);
    }

}
