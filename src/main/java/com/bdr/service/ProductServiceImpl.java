package com.bdr.service;

import com.bdr.model.Product;

class ProductServiceImpl implements ProductService {


    @Override
    public void getProduct(Product product) {
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getCategory());

    }


    public void setProduct(Product product, int id, String name, float price, String category) {
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setCategory(category);

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(Product product) {
        product.setId(0);
        product.setName(null);
        product.setPrice(0.0F);
        product.setCategory(null);

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
