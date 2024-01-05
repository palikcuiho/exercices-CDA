package org.azertyuiop.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ThermometreTest {

    private Thermometre thermometre;

    @BeforeEach
    public void setup(){thermometre = new Thermometre();}

    @Test
    public void should_return_0_when_array_is_empty(){
        int[] temperatures = {};
        int result = thermometre.getTemperatureClosestToZero(temperatures);
        assertEquals(0, result);
    }

    @Test
    public void should_throw_if_array_is_too_big(){
        int[] temperatures = new int[10001];
        assertThrows(
                IllegalArgumentException.class,
                () -> thermometre.getTemperatureClosestToZero(temperatures));
    }


}
