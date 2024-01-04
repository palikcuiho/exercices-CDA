package org.azertyuiop.tp2;

public abstract class Salarie {
    public Salaire salaire;

    public Salarie(Salaire salaire, Identite identite) {
        this.salaire = salaire;
        this.identite = identite;
    }

    public Identite identite;
    public static final double TEMPS_PLEIN = 151.67;

    public void travailler(){
        travailler(TEMPS_PLEIN);
    }
    public void travailler(double nombreHeures){
        String nomSalarie = this.identite.getNomComplet();
        double salaire = this.salaire.payer(nombreHeures);
        System.out.println("Le salarié " + this.identite.getNomComplet()
                + " a travaillé "
                + nombreHeures
                + " heures et a perçu "
                + salaire
                + " euros.");
    }

    public void demenager(Adresse nouvelleAdresse){
        this.identite.adresse = nouvelleAdresse;
    }

    public void augmenter(float pourcentage){
        this.salaire.tauxHoraire = this.salaire.tauxHoraire*(100+pourcentage)/100;
    }
}
