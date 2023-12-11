package org.azertyuiop.tp1;

import java.util.ArrayList;

public class Ex3 {

    public static boolean estUnPalindrome(int nombre) throws IllegalArgumentException {

        nombrePositifException(nombre);

        deuxChiffresMinimumException(nombre);

        int quotient = nombre; // 121
        int reste = 0;
        ArrayList<Integer> tableau = new ArrayList<>();
        ArrayList<Integer> uaelbat = new ArrayList<>();
        do {
            reste = quotient % 10; //1
            quotient = quotient / 10; //12
            uaelbat.add(reste);
            tableau.addFirst(reste);
        } while (quotient != 0);

        return tableau.equals(uaelbat);
    }

    private static void deuxChiffresMinimumException(int nombre) {
        if (nombre < 10) {
            throw new IllegalArgumentException("Le nombre doit contenir au moins deux chiffres.");
        }
    }

    private static void nombrePositifException(int nombre) {
        if (nombre <= 0) {
            throw new IllegalArgumentException("Le nombre doit être supérieur à 0.");
        }
    }
}