package org.azertyuiop.tp2;

public class Identite {

    public Adresse adresse;
    public String nom;
    public String prenom;

    public Identite(Adresse adresse, String nom, String prenom) {
        this.adresse = adresse;
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * Retourne le nom complet du salarié
     */
    public String getNomComplet(){
        return prenom + " " + nom;
    }
}
