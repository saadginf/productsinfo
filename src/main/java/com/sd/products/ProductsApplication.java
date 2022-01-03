package com.sd.products;

import com.sd.products.entity.Produit;
import com.sd.products.service.PrduitServiceImplementation;
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
		// TODO Auto-generated method stub
		Produit p = new Produit("PS5", "Gaming", 7000, 4);
		produitService.saveProduit(p);

	}

}
