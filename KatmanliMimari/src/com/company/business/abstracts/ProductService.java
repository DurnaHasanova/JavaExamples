package com.company.business.abstracts;

import com.company.entities.concretes.Product;

import java.util.ArrayList;

public interface ProductService {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    Product get(int id);
    ArrayList<Product> getAll();
}
