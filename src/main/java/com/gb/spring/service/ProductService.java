package com.gb.spring.service;

import com.gb.spring.model.Product;
import com.gb.spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    ProductRepository pr;

    @Autowired
    public void setPr(@Qualifier("productRepository") ProductRepository pr) {
        this.pr = pr;
    }

    public Product createProduct(String name, double cost) {
        return pr.add(name,cost);
    }

    public List<Product> getAllProducts() {
        return pr.getAll();
    }

    public Product getProductById(int id) {
        return pr.getById(id);
    }
}
