package com.examen.msawadiengditi5.web.controller;

import com.examen.msawadiengditi5.dao.ProductDao;
import com.examen.msawadiengditi5.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Awa DIENG DITI5
@RestController
public class ProductController {

    //Awa DIENG DITI5

    @Autowired
    private ProductDao productDao;

    //Awa DIENG DITI5

    //Récupérer la liste des produits
    @RequestMapping(value="/Produits", method=RequestMethod.GET)
    public List<Product> listeProduits() {
        return productDao.findAll();
    }

    //Awa DIENG DITI5

    //Récupérer un produit par son Id
    @GetMapping(value="/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        return productDao.findById(id);
    }
}
