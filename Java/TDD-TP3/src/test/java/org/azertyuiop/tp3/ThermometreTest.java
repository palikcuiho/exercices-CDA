package org.azertyuiop.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThermometreTest {

    @Test
    public void should_return_0_when_array_is_empty(){
        Thermometre thermometre = new Thermometre();
        int[] temperatures = {};
        int result = thermometre.getTemperatureClosestToZero(temperatures);
        assertEquals(0, result);
    }
}
