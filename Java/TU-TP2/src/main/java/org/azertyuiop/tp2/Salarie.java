package org.azertyuiop.tp2;

public abstract class Salarie {
    public Salaire salaire;

    public Salarie(Salaire salaire, Identite identite) {
        this.salaire = salaire;
        this.identite = identite;
    }

    public Identite identite;

    /**
     * Nombre d'heures correspondant à un temps plein
     */
    public static final double TEMPS_PLEIN = 151.67;


    /**
     * Affiche dans la console les heures effectuées par le salarié ainsi que son salaire
     * @param nombreHeures les heures travaillées
     */
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

    /**
     * Affiche dans la console le salaire du salarié pour un temps plein
     */
    public void travailler(){
        travailler(TEMPS_PLEIN);
    }

    /**
     * Modifie l'adresse du salarié
     * @param nouvelleAdresse remplace l'ancienne adresse
     */
    public void demenager(Adresse nouvelleAdresse){
        this.identite.adresse = nouvelleAdresse;
    }

    /**
     * Augmente le salaire horaire du salarié
     * @param pourcentage représente le pourcentage d'augmentation
     */
    public void augmenter(float pourcentage){
        this.salaire.tauxHoraire = this.salaire.tauxHoraire*(100+pourcentage)/100;
    }
}
