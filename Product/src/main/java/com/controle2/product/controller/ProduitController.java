package com.controle2.product.controller;


import com.controle2.product.entity.Produit;
import com.controle2.product.repository.ProduitRepo;
import com.controle2.product.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class ProduitController {

    @Autowired
    private ProduitRepo produitRepo;


    @QueryMapping
    public List<Produit> allProducts() {
        return produitRepo.findAll();
    }


    @MutationMapping
    public Produit addProduct(String name, double price, int quantity) {
        Produit product = new Produit();
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);
        return produitRepo.save(product);
    }
}
