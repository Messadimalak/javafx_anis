//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package edu.esprit.entities;

import java.util.Objects;

public class Categorie_c {
    private int id;
    private String nom_c;
    private String description;

    public Categorie_c() {
    }

    public Categorie_c(String nom_c, String description) {
        this.nom_c = nom_c;
        this.description = description;
    }

    public Categorie_c(int id, String nom_c, String description) {
        this.id = id;
        this.nom_c = nom_c;
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_c() {
        return this.nom_c;
    }

    public void setNom_c(String nom_c) {
        this.nom_c = nom_c;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Categorie_c that = (Categorie_c)o;
            return this.id == that.id;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id});
    }

    public String toString() {
        return "Categorie_c{nom_c='" + this.nom_c + "', description='" + this.description + "'}";
    }
}
