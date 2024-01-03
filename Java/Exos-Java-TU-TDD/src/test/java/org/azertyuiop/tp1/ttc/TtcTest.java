package org.azertyuiop.tp1.ttc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TtcTest {

    private Ttc ttc;

    private final int PRIX_NEGATIF = -1;

    @BeforeEach
    public void setup(){
        ttc = new Ttc();
    }

    @DisplayName("Test avec un prix négatif")
    @Test
    public void testPrixNegatif() {
        assertThrows(
                IllegalArgumentException.class,
                () -> ttc.HtToTtc(PRIX_NEGATIF));
    }

    @DisplayName("Test du calcul du prix TTC (taux à 20%)")
    @ParameterizedTest(name = "Test {index} : {0}€ HT → {1}€ TTC ")
    @CsvSource({
            "100, 120",
            "50, 60"
    })
    public void testAjoutTva(int prixHt, int prixTtc) {
        double resultat = ttc.HtToTtc(prixHt);
        assertEquals(prixTtc,resultat);
    }

//    @DisplayName("Test du calcul du prix TTC")
//    @ParameterizedTest(name = "Test {index} : {0}€")
//    @ValueSource(ints = {100, 50})
//    public void testAjoutTva2(int prixHt) {
//    double resultat = ttc.HtToTtc(prixHt);
//    assertEquals(prixHt*ttc.TVA,resultat);
//    }

}