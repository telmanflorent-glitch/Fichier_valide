package org.example.entities;

public class Ligne_Commande {
    private int num_ligne_commande;
    private int quantite;
    private double prix_unitaire;
    public double montant_ligne;
    private Commande commande;
    private Produit produit;

    public Ligne_Commande() {}

    public Ligne_Commande(int num_ligne_commande, int quantite, double prix_unitaire) {
        this.num_ligne_commande = num_ligne_commande;
        this.quantite = quantite;
        this.prix_unitaire = prix_unitaire;
        this.commande = commande;
        this.produit =  produit;
        this.montant_ligne = prix_unitaire;
    }


    public int getNum_ligne_commande() {
        return num_ligne_commande;
    }

    public void setNum_ligne_commande(int num_ligne_commande) {
        this.num_ligne_commande = num_ligne_commande;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix_unitaire() {
        return prix_unitaire;
    }

    public void setPrix_unitaire(double prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }


}

