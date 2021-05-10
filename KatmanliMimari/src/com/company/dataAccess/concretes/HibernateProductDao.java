package com.company.dataAccess.concretes;
import com.company.dataAccess.abstractes.ProductDao;
import com.company.entities.concretes.Product;
import java.util.ArrayList;

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println(product.getName()+" is added");
    }

    @Override
    public void update(Product product) {
        System.out.println(product.getName()+"is updated");
    }

    @Override
    public void delete(Product product) {
        System.out.println(product.getName()+"is deleted");
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
