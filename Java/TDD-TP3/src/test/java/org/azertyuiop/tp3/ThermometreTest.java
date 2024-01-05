package org.azertyuiop.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest()
    @CsvSource({
            "1,2,3",
            "4,5,6"
    })
    public void should_return_smallest_positive(int data1, int data2, int data3){
        int[] temperatures = {data1,data2,data3};
        int result = thermometre.getTemperatureClosestToZero(temperatures);
        assertEquals(data1, result);
    }

    @ParameterizedTest()
    @CsvSource({
            "-1,-2,-3",
            "-4,-5,-6"
    })
    public void should_return_biggest_negative(int data1, int data2, int data3){
        int[] temperatures = {data1,data2,data3};
        int result = thermometre.getTemperatureClosestToZero(temperatures);
        assertEquals(data1, result);
    }

}
