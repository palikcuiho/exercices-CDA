package org.azertyuiop.tp1.palindrome;

public class Palindrome {

    /**
     * Vérifie si un nombre est un palindrome
     * @param nombre long : Nombre à vérifier
     * @return boolean : Vrai si le nombre est un palindrome, faux sinon
     */
    public boolean estUnPalindrome(long nombre) {
        verifierNombre(nombre);

        return nombre == renverserNombre(nombre);
    }

    /**
     * Renverse un nombre
     * @param nombre long : Nombre à renverser
     * @return long : Nombre renversé
     */
    private long renverserNombre(long nombre) {
        long decompte = nombre;
        long renverse = 0;
        while (decompte != 0) {
            renverse = renverse * 10 + (decompte % 10);
            decompte /= 10;
        }
        return renverse;
    }

    /**
     * Vérifie que le nombre contient au moins 2 chiffres
     * @param nombre long : Nombre à vérifier
     */
    private void verifierNombre(long nombre) {
        if (nombre < 10) {
            throw new IllegalArgumentException("Le nombre doit contenir au moins 2 chiffres");
        }
    }
}
