package com.sd.products.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
    // Un produit est défini par : (référence, désignation, type, prix, quantité)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reference;
    private String designation;
    private String type;
    private double prix;
    private int quantite;

    public Produit() {
    }

    public Produit(String designation, String type, double prix, int quantite) {
        this.designation = designation;
        this.type = type;
        this.prix = prix;
        this.quantite = quantite;
    }

    /**
     * @return Long return the reference
     */
    public Long getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(Long reference) {
        this.reference = reference;
    }

    /**
     * @return String return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return String return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return double return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * @return int return the quantite
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * @param quantite the quantite to set
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

}
