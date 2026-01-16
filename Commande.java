package org.example.entities;


public class Commande {
    private int id_commande;
    private int date_commande;
    private String etat_commande;
    private int  total_commande;
    private Utilisateur utilisateur;

    public Commande() {}

    public Commande(int id_commande, int date_commande, String etat_commande, int total_commande, Utilisateur utilisateur) {
        this.id_commande = id_commande;
        this.date_commande = date_commande;
        this.etat_commande = etat_commande;
        this.total_commande = total_commande;
        this.utilisateur = utilisateur;

    }

    public int getId_commande() {return id_commande;}
    public void setId_commande(int id_commande) {this.id_commande = id_commande;}
    public int getDate_commnade() {return date_commande;}
    public int setDate_commande() {return date_commande;}
    public String getEtat_commande() {return etat_commande;}
    public int setEtat_commande() {return total_commande;}
    public int getTotal_commande() {return total_commande;}
    public void setTotal_commande(int total_commande) {this.total_commande = total_commande;}
    public Utilisateur getUtilisateur() {return utilisateur;}

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
