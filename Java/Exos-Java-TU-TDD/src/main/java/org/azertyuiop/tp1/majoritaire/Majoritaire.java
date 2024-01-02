package org.azertyuiop.tp1.majoritaire;

import java.util.HashMap;
import java.util.Map;

public class Majoritaire {
    /**
     * Retourne le nombre majoritaire d'un tableau qui en contient un
     * Un élément est majoritaire s'il apparaît plus de n/2 fois dans le tableau
     * Où 'n' est la taille du tableau
     * @param nombres Tableau de nombres
     * @return Nombre majoritaire
     */
    public int hashMap(int[] nombres) {
        int taille = nombres.length;
        Map<Integer, Integer> compteur = new HashMap<>();

        for (int nombre : nombres) {
            compteur.put(nombre, compteur.getOrDefault(nombre, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> nombre : compteur.entrySet()) {
            if (nombre.getValue() > taille / 2) {
                return nombre.getKey();
            }
        }
        return 0;
    }
}
