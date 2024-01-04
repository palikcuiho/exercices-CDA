package org.azertyuiop.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class SalarieCdiTest {

    private SalarieCdi salarieCdi;

    private Identite identiteMock;

    private Salaire salaireMock;


    @BeforeEach
    public void setup(){
        identiteMock = mock(Identite.class);

        salaireMock = mock(Salaire.class);

        salarieCdi = new SalarieCdi(salaireMock, identiteMock);
    }

    @DisplayName("Test de la méthode déménager")
    @Test
    public void testDemenager(){
        Adresse nouvelleAdresse = mock(Adresse.class);
        salarieCdi.demenager(nouvelleAdresse);
        assertEquals(nouvelleAdresse, this.identiteMock.adresse);
    }

    @DisplayName("Test de l'augmentation du salaire")
    @ParameterizedTest()
    @CsvSource({
            "10,20,12",
            "20,10,22"
    })
    public void testAugmenter(double tauxHoraire, float tauxAugmentation, double salaireAttendu){
        salarieCdi.salaire.tauxHoraire = tauxHoraire;
        salarieCdi.augmenter(tauxAugmentation);
        assertEquals( salarieCdi.salaire.tauxHoraire, salaireAttendu);
    }


}