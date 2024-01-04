package org.azertyuiop.tp2;

public class Identite {

    public Adresse adresse;
    public String nom;
    public String prenom;

    /**
     * Retourne le nom complet du salarié
     */
    public String getNomComplet(){
        return prenom + " " + nom;
    }
}
