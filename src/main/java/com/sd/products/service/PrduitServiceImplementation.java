package com.sd.products.service;

import java.util.ArrayList;
import java.util.List;

import com.sd.products.dao.ProduitRepository;
import com.sd.products.entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrduitServiceImplementation implements ProduitService {
    // Injection des dependances
    // inversion de controles

    @Autowired
    ProduitRepository produitRepository;

    @Override
    public Produit saveProduit(Produit produit) {
        // TODO Auto-generated method stub
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> findAllProduits() {
        // TODO Auto-generated method stub

        return produitRepository.findAll();
    }

    @Override
    public Produit findPrduitById(Long id) {
        // TODO Auto-generated method stub
        return produitRepository.findById(id).get();
    }

    @Override
    public void supprimerProduit(Long id) {
        // TODO Auto-generated method stub
        produitRepository.deleteById(id);

    }

}
