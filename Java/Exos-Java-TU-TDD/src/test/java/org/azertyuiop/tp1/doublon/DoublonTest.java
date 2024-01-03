package org.azertyuiop.tp1.doublon;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DoublonTest {

    private Doublon doublon;

    @BeforeEach
    public void setUp() {
        doublon = new Doublon();
    }

    @DisplayName("Test si le tableau contient un doublon")
    @ParameterizedTest
    @CsvSource({"1, 1, 2"})
    public void testDoublon(int premierNombre, int deuxiemeNombre, int troisiemeNombre){
        int[] tableauATester = new int[]{premierNombre, deuxiemeNombre, troisiemeNombre};
        boolean resultat = doublon.verifierSiDoublons(tableauATester);
        assertTrue(resultat);
    };

    @DisplayName("Test si le tableau ne contient pas de doublon")
    @ParameterizedTest
    @CsvSource({"1, 2, 3"})
    public void testPasDeDoublon(int premierNombre, int deuxiemeNombre, int troisiemeNombre){
        int[] tableauATester = new int[]{premierNombre, deuxiemeNombre, troisiemeNombre};
        boolean resultat = doublon.verifierSiDoublons(tableauATester);
        assertFalse(resultat);
    }


}