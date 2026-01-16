package org.example.entities;

public class Categorie {
    private int code_categorie;
    private String libelle_categorie;

    public Categorie(int code_categorie, String libelle_categorie) {
        this.code_categorie = code_categorie;
        this.libelle_categorie = libelle_categorie;
    }

    public Categorie() {};

    public int getCode_categorie() { return  code_categorie; };

    public void setCode_categorie(int code_categorie) {
        this.code_categorie = code_categorie;
    }

    public String getLibelle_categorie() {return libelle_categorie; };

    public void setLibelle_categorie(String libelle_categorie) {
        this.libelle_categorie = libelle_categorie;
    }
}
