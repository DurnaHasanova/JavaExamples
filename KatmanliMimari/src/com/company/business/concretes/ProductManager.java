package com.company.business.concretes;

import com.company.business.abstracts.ProductService;
import com.company.dataAccess.abstractes.ProductDao;
import com.company.dataAccess.concretes.HibernateProductDao;
import com.company.entities.concretes.Product;

import java.util.ArrayList;


public class ProductManager implements ProductService {

    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void add(Product product) {

       if(product.getCategoryId()==1){
           System.out.println("bu bategoride urun kabul edilmiyor");

       }
       else  this.productDao.add(product);
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

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
