package org.azertyuiop.tp2;

public class Identite {

    public Adresse adresse;
    public String nom;
    public String prenom;
    public String getNomComplet(){
        return prenom + " " + nom;
    }
}
