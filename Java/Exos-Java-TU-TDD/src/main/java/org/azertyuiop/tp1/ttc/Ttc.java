package org.azertyuiop.tp1.ttc;

public class Ttc {

    /**
     * Taux de TVA à 20%
     */
    public final double TVA = 1.20;

    /**
     * Calcule le prix TTC à partir du prix HT
     * @param prixHt Prix HT
     * @return Prix TTC
     */
    public double HtToTtc(int prixHt) {

        verifierPrix(prixHt);

        return ajouterTva(prixHt);
    }

    /**
     * Ajoute la TVA à un nombre
     * @param prixHt Nombre à multiplier par la TVA
     * @return Nombre multiplié par la TVA
     */
    private double ajouterTva(int prixHt) {
        return prixHt * this.TVA;
    }

    /**
     * Vérifie que le prix HT est positif
     * @param prixHt Prix HT
     */
    private void verifierPrix(int prixHt) {
        if (prixHt < 0) {
            throw new IllegalArgumentException("Le prix HT doit être positif");
        }
    }
}