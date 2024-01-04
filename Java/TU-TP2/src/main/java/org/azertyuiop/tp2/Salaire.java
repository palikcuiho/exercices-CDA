package org.azertyuiop.tp2;

public class Salaire {

    /**
     * Salaire horaire du salarié
     */
    public double tauxHoraire;

    /**
     * Majoration du salaire horaire pour les heures supplémentaires
     */
    public static final double MAJORATION = 1.25;

    /**
     * Calcule la rémunération du salarié selon ses heures travaillées,
     * en tenant compte des heures supplémentaires
     * @param nombreHeures : le nombre d'heures travaillées par le salarié
     * @return le salaire (arrondi au 2e chiffre après la virgule)
     */
    public double payer(double nombreHeures){
        double heuresSupplementaires = 0;
        if (nombreHeures > Salarie.TEMPS_PLEIN) {
            heuresSupplementaires = nombreHeures - Salarie.TEMPS_PLEIN;
            nombreHeures = Salarie.TEMPS_PLEIN;
        }
        double salaire = nombreHeures*tauxHoraire + heuresSupplementaires*tauxHoraire*MAJORATION;
            return (double) Math.round(salaire * 100) / 100;
    };
}
