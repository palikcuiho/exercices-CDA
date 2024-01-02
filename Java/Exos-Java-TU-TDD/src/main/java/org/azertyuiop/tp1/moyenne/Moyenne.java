package org.azertyuiop.tp1.moyenne;

public class Moyenne {
    public int moyenne(int[] notes) {

        verifierTaille(notes);

        verifierNotes(notes);

        return calculerMoyenne(notes);
    }

    /**
     * Calcule la moyenne des notes
     * @param notes Tableau de notes
     * @return La moyenne des notes
     */
    private int calculerMoyenne(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return somme / notes.length;
    }

    /**
     * Vérifie que les notes sont comprises entre 0 et 20
     * @param notes Tableau de notes
     */
    private void verifierNotes(int[] notes) {
        for (int note : notes) {
            if (note < 0 || note > 20) {
                throw new IllegalArgumentException("Les notes doivent être comprises entre 0 et 20");
            }
        }
    }

    /**
     * Vérifie que le carnet de notes contient 3 notes
     * @param notes Tableau de notes
     */
    private void verifierTaille(int[] notes) {
        if (notes.length != 3) {
            throw new IllegalArgumentException("Le carnet de notes doit contenir 3 notes");
        }
    }
}
