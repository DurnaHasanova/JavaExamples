package com.company;

import com.company.business.abstracts.ProductService;
import com.company.business.concretes.ProductManager;
import com.company.dataAccess.concretes.AbcProducDao;
import com.company.dataAccess.concretes.HibernateProductDao;
import com.company.entities.concretes.Product;

public class Main {

    public static void main(String[] args) {


        ProductService productService=new ProductManager(new AbcProducDao());
        productService.add(new Product(1,"Test",2,12,1));
    }
}
