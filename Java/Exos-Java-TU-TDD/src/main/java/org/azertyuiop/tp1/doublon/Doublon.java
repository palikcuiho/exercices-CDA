package org.azertyuiop.tp1.doublon;

import java.util.HashMap;

public class Doublon {
    /**
     * Vérifie si un tableau contient un doublon
     * @param nombres Tableau de nombres
     * @return Vrai si le tableau contient un doublon, faux sinon
     */
    public boolean verifierSiDoublons(int[] nombres) {
        HashMap<Integer, Integer> vues = new HashMap<>();

        for (int nombre : nombres) {
            if (vues.containsKey(nombre) && vues.get(nombre) >= 1) {
                return true;
            }
            vues.put(nombre, vues.getOrDefault(nombre, 0) + 1);
        }
        return false;
    }
}
