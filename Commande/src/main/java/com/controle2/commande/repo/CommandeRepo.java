package com.controle2.commande.repo;

import com.controle2.commande.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepo extends JpaRepository<Commande,Long> {
}
