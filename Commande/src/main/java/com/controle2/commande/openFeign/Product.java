package com.controle2.commande.openFeign;


import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.http.ResponseEntity;

public interface Product {
    @MutationMapping
    public ResponseEntity<?> getProductById(Long id);
}
