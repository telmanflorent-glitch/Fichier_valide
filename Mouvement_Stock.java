package org.example.entities;



public class Mouvement_Stock {
    private int id_mouvement;
    private String type_mouvement;
    private int date_mouvement;
    private String  motif;
    private int quantite;
    private Utilisateur utilisateur;


    public Mouvement_Stock(int id_mouvement, String type_mouvement, int date_mouvement, String motif, int quantite,  Utilisateur utilisateur) {
        this.id_mouvement = id_mouvement;
        this.type_mouvement = type_mouvement;
        this.date_mouvement = date_mouvement;
        this.motif = motif;
        this.quantite = quantite;
        this.utilisateur = utilisateur;
    }

    public int getId_mouvement() {return id_mouvement;}

    public void setId_mouvement(int id_mouvement) {this.id_mouvement = id_mouvement;}


    public String getType_mouvement() {return type_mouvement;}

    public void setDate_mouvement(int date_mouvement) {
        this.date_mouvement = date_mouvement;
    }
    public int getDate_mouvement() {return date_mouvement;}


    public String getMotif() {return motif;}
    public void setMotif(String motif) {this.motif = motif;}





    public int getQuantite() { return quantite; }
    public void setQuantite(int quantite) { this.quantite = quantite; }

    public Utilisateur getUtilisateur() {return utilisateur;}

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
