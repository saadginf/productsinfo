package com.sd.products;

import java.util.List;

import com.sd.products.entity.Produit;
import com.sd.products.service.ProduitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {
	@Autowired
	ProduitService produitService;

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Produit> ps = produitService.findAllProduits();
		System.out.println("-------------------------");
		System.out.println(ps);
		// for (Produit produit : ps) {
		// System.out.println(produit.getDesignation());
		// }

		for (int i = 0; i < ps.size(); i++) {
			Produit pTemp = ps.get(i);
			System.out.println(pTemp.getDesignation() + " " + pTemp.getPrix());
		}
		System.out.println("-------------------------");

		Produit p1 = produitService.findPrduitById(11L);
		System.out.println(p1.getDesignation());

	}

}
