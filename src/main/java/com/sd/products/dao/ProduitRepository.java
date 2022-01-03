package com.sd.products.dao;

import com.sd.products.entity.Produit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
