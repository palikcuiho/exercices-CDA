package org.azertyuiop.tp1.romanToNumber;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {

    public final Map<Character, Integer> NOMBRES_ROMAINS = new HashMap<>();

    public RomanToNumber() {
        ajouterNombresRomains();
    }

    /**
     * Convertit un nombre romain en nombre arabe
     * @param nombreRomain String : Nombre romain
     * @return int : Nombre arabe
     */
    public int convertirNombreRomainEnNombreArabe(String nombreRomain) {

        ajouterNombresRomains();

        int nombreArabe = 0;

        for (int index = 0; index < nombreRomain.length(); index++) {
            if (
                    index != nombreRomain.length() - 1
                            && estUnNombreSpecial(nombreRomain.charAt(index), nombreRomain.charAt(index + 1))
            ) {
                nombreArabe -= NOMBRES_ROMAINS.get(nombreRomain.charAt(index));
            } else {
                nombreArabe += NOMBRES_ROMAINS.get(nombreRomain.charAt(index));
            }
        }
        return nombreArabe;
    }

    /**
     * Ajoute les nombres romains dans la map
     */
    private void ajouterNombresRomains() {
        NOMBRES_ROMAINS.put('I', 1);
        NOMBRES_ROMAINS.put('V', 5);
        NOMBRES_ROMAINS.put('X', 10);
        NOMBRES_ROMAINS.put('L', 50);
        NOMBRES_ROMAINS.put('C', 100);
        NOMBRES_ROMAINS.put('D', 500);
        NOMBRES_ROMAINS.put('M', 1000);
    }

    /**
     * Vérifie si le chiffre romain actuel est un nombre spécial en le comparant avec le nombre suivant.
     * Si le nombre actuel est plus petit que le nombre suivant, alors il s'agit d'un nombre spécial.
     * @param nombreActuel  Nombre romain actuel
     * @param nombreSuivant Nombre romain suivant
     * @return Vrai si le nombre romain est un nombre spécial, faux sinon
     */
    private boolean estUnNombreSpecial(
            char nombreActuel,
            char nombreSuivant
    ) {
        return this.NOMBRES_ROMAINS.get(nombreActuel) < this.NOMBRES_ROMAINS.get(nombreSuivant);
    }
}
