package org.azertyuiop.tp1;

import java.util.ArrayList;

public class Ex4 {

    public static boolean contientUnDoublon(ArrayList<Integer> tableau) {
        boolean resultat = false;
        for (Integer entree: tableau) {
            ArrayList<Integer> tableau2 = new ArrayList<>(tableau);
            tableau2.remove(entree);
            if (tableau2.contains(entree))
                resultat = true;
        }
    return resultat;
    }
}
