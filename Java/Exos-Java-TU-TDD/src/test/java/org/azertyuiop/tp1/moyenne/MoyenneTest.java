package org.azertyuiop.tp1.moyenne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Named;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MoyenneTest {

    private Moyenne moyenne;

    private final int[] troisNotesValides = new int[]{5,10,15};

    @BeforeEach
    public void setup(){
        moyenne = new Moyenne();
    }

    @DisplayName("Test de l'absence d'erreurs avec trois notes valides")
    @Test
    public void testTroisNotesValides() {
        assertDoesNotThrow(() -> moyenne.moyenne(troisNotesValides));
    }

    @DisplayName("Test que le calcul de la moyenne est correct")
    @ParameterizedTest(name = "Test {index} : moyenne de {0}, {1} et {2} = {3}")
    @CsvSource({
            "10, 10, 10, 10",
            "5, 10, 15, 10",
            "17, 18, 19, 18"
    })
    public void testCalculerMoyenne(int premiereNote, int deuxiemeNote, int troisiemeNote, int moyenneDesNotes){
            int[] notes = new int[]{premiereNote, deuxiemeNote, troisiemeNote};
            // Act
            int resultat = moyenne.moyenne(notes);

            // Assert
            assertEquals(moyenneDesNotes, resultat);
    }

    private static Stream<Arguments> argumentsVerifierTaille() {
        return Stream.of(
                Arguments.of(Named.of("2 notes",(Object) new int[]{1,2})),
                Arguments.of(Named.of("4 notes",(Object) new int[]{1,2,3,4}))
        );
    }

    @DisplayName("Test avec un nombre incorrect de notes")
    @ParameterizedTest()
    @MethodSource("argumentsVerifierTaille")
    public void testTailleIncorrecte(int[] argumentsVerifierTaille) {
        assertThrows(
                IllegalArgumentException.class,
                () -> moyenne.moyenne(argumentsVerifierTaille));
    }

    private static Stream<Arguments> argumentsNotesInvalides() {
        return Stream.of(
                Arguments.of(Named.of("Une note négative",(Object) new int[]{10, 10, -5})),
                Arguments.of(Named.of("Une note supérieure à 20",(Object) new int[]{10, 10, 25}))
        );
    }

    @DisplayName("Test lorsque les notes ne sont pas valides")
    @ParameterizedTest()
    @MethodSource("argumentsNotesInvalides")
    public void testNotesInvalides(int[] argumentsNotesInvalides) {
        assertThrows(
                IllegalArgumentException.class,
                () -> moyenne.moyenne(argumentsNotesInvalides));
    }

}