//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package edu.esprit.entities;

import java.util.Objects;

public class Centre_c {
    private int id;
    private String adresse;
    private String nom;
    private String contact;
    private String gallery;
    private String description;
    private String image;

    public Centre_c() {
    }

    public Centre_c(String adresse, String nom, String contact, String gallery, String description, String image) {
        this.adresse = adresse;
        this.nom = nom;
        this.contact = contact;
        this.gallery = gallery;
        this.description = description;
        this.image = image;
    }

    public Centre_c(int id, String adresse, String nom, String contact, String gallery, String description, String image) {
        this.id = id;
        this.adresse = adresse;
        this.nom = nom;
        this.contact = contact;
        this.gallery = gallery;
        this.description = description;
        this.image = image;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGallery() {
        return this.gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Centre_c centreC = (Centre_c)o;
            return this.id == centreC.id;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id});
    }

    public String toString() {
        return "Centre_c{adresse='" + this.adresse + "', nom='" + this.nom + "', contact='" + this.contact + "', gallery='" + this.gallery + "', description='" + this.description + "', image='" + this.image + "'}";
    }
}
