package com.examen.msawadiengditi5.dao;

import com.examen.msawadiengditi5.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
//Awa DIENG DITI5
@Repository
public class ProductDaoImpl implements ProductDao {

    //Awa DIENG DITI5
    public static List<Product> products=new ArrayList<>();
    //Awa DIENG DITI5
    static {
        products.add(new Product(1, new String("Ordinateur portable"), 350000));
        products.add(new Product(2, new String("Sac à main"), 15000));
        products.add(new Product(3, new String("Ballerines"), 8000));
    }
    //Awa DIENG DITI5

    @Override
    public List<Product>findAll() {
        return products;
    }
    //Awa DIENG DITI5
    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if(product.getId() ==id){
                return product;
            }
        }
        return null;
    }

    //Awa DIENG DITI5
    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }
}
