package com.company.dataAccess.concretes;

import com.company.dataAccess.abstractes.ProductDao;
import com.company.entities.concretes.Product;

import java.util.ArrayList;

public class AbcProducDao  implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println(product.getName()+" is added with ABC");
    }

    @Override
    public void update(Product product) {
        System.out.println(product.getName()+" is update with ABC");
    }

    @Override
    public void delete(Product product) {
        System.out.println(product.getName()+" is deleted with ABC");
    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public ArrayList<Product> getAll() {
        return null;
    }
}
