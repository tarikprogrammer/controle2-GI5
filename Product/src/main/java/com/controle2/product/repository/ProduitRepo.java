package com.controle2.product.repository;

import com.controle2.product.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepo extends JpaRepository<Produit, Long> {
}
