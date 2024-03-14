package com.bdr.service;

import com.bdr.model.Product;

import java.util.ArrayList;
import java.util.List;

class ProductServiceImpl implements ProductService {
    ArrayList<Product> products = new ArrayList<Product>();

    @Override
    public Product getProduct(String name) {
        try {
            for (Product product : products) {
                if (product.getName().equals(name)) {
                    return product;
                }
            }
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException"+e.getMessage());
        }
            return null;
    }


    public Product addProduct(Product product) {
        products.add(product);
        return product;

    }

    @Override
    public void updateProduct(Product product) {


    }

    @Override
    public void deleteProduct(String name) {
        try {
            for (Product product : products) {
                if (product.getName().equals(name)) {
                    products.remove(product);
                }
            }
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException"+e.getMessage());
        }

    }

    @Override
    public List<Product> getProducts() throws IllegalAccessException {
        if(products.isEmpty()){
            throw new IllegalAccessException("Products is empty");
        }
        return products;
        }


//    public static void main(String[] args) {
//        Product p = new Product();
//        ProductServiceImpl productService = new ProductServiceImpl();
//        productService.setProduct(p,1,"learn java ",10,"Books");
//        productService.getProduct(p);
//        productService.deleteProduct(p);
//        productService.getProduct(p);
//    }
}
