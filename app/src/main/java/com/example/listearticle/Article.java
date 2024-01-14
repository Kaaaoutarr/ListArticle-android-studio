package com.example.listearticle;
import java.io.Serializable;

public class Article implements Serializable {
    private int id;
    private String nom;
    private double pu;

    public Article(int id, String nom, double pu) {
        this.id = id;
        this.nom = nom;
        this.pu = pu;
    }

    // Getter and setter methods for id, nom, and pu

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", pu=" + pu +
                '}';
    }
}
