package org.azertyuiop.tp2;

public class Salaire {

    public double tauxHoraire;

    public static final double MAJORATION = 1.25;

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
