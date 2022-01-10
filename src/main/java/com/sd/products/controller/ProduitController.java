package com.sd.products.controller;

import java.util.List;

import com.sd.products.entity.Produit;
import com.sd.products.service.ProduitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProduitController {

    @Autowired
    ProduitService produitService;

    @GetMapping(path = "/index")
    public String index() {
        return "index";
    }

    @GetMapping(path = "/produits")
    public String produit(Model model) {
        List<Produit> ps = produitService.findAllProduits();
        // ajouter de la donnée q lq pqge html
        model.addAttribute("produitshtml", ps);
        return "produits";
    }
}
