package org.azertyuiop.tp1.palindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    private Palindrome palindrome;

    private final int NOMBRE_TROP_COURT = 1;

    @BeforeEach
    public void setup(){
        palindrome = new Palindrome();
    }

    @DisplayName("Test lorsque le nombre est trop court")
    @Test
    public void testNombreTropCourt() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> palindrome.estUnPalindrome(NOMBRE_TROP_COURT));
    }

    @DisplayName("Test de la vérification de si un nombre est un palindrome")
    @ParameterizedTest()
    @CsvSource({
            "101, true",
            "56765, true",
            "12345, false"
    })
    public void testEstUnPalindrome(int nombreATester, boolean resultatAttendu) {
        boolean resultat = palindrome.estUnPalindrome(nombreATester);
        assertEquals(resultatAttendu, resultat);
    }

}