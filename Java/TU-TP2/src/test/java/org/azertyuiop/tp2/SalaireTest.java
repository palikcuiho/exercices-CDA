package org.azertyuiop.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SalaireTest {

    private Salaire salaire;

    @BeforeEach
    public void setup(){
        salaire = new Salaire();
        salaire.tauxHoraire = 15;
    }

    @DisplayName("Test de la paie sans heures supplémentaires")
    @ParameterizedTest(name = "Test {index} : {0}h → {1}€")
    @CsvSource({
            "1, 15",
            "100, 1500",
            "151.67, 2275.05"
    })
    public void testPayerSansHeuresSupplementaires(double nombreHeures, double salaireAttendu){
        double resultat = salaire.payer(nombreHeures);
        assertEquals(salaireAttendu, resultat);
    }

    @DisplayName("Test de la paie avec heures supplémentaires")
    @ParameterizedTest(name = "Test {index} : {0}h → {1}€")
    @CsvSource({
            "152.67, 2293.80"
    })
    public void testPayerAvecHeuresSupplementaires(double nombreHeures, double salaireAttendu){
        double resultat = salaire.payer(nombreHeures);
        assertEquals(salaireAttendu, resultat);
    }

}