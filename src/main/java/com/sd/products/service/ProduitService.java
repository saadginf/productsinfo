package com.sd.products.service;

import java.util.List;

import com.sd.products.entity.Produit;

public interface ProduitService {
    // Mettre à jour un produit
    // ajouter de nouveaux produits
    Produit saveProduit(Produit produit);

    // consulter les produits
    List<Produit> findAllProduits();

    // chercher les produits par mots clé
    // Consulter un produit
    Produit findPrduitById(Long id);

    // Supprimer un produit
    void supprimerProduit(Long id);

}
