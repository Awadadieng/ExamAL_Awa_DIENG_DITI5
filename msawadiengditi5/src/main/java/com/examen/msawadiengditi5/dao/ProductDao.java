package com.examen.msawadiengditi5.dao;

import com.examen.msawadiengditi5.model.Product;

import java.util.List;

//Awa DIENG DITI5
public interface ProductDao {
    //Awa DIENG DITI5

    public List<Product> findAll();
    public Product findById(int id);
    public Product save(Product product);
}
