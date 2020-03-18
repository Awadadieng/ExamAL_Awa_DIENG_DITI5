package com.examen.msawadiengditi5.model;

//Awa DIENG DITI5
public class Product {
    //Awa DIENG DITI5

    private int id;
    private String nom;
    private int prix;

    //Awa DIENG DITI5

    public Product() {
    }
    //Awa DIENG DITI5

    public Product(int id, String nom, int prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    //Awa DIENG DITI5

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }


    @Override
    public String toString() {
        return "Product{"+
                "id=" + id +
                ", nom='"+ nom + '\'' +
                ", prix=" + prix+ '}';
    }

}
