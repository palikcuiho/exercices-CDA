package org.azertyuiop.tp3;

import static java.lang.Math.abs;

public class Thermometre {

    public int getTemperatureClosestToZero(int[] temperatures) {
        if (temperatures.length == 0)
            return 0;
        if (temperatures.length > 10000)
            throw new IllegalArgumentException("Le nombre de mesures ne doit pas excéder 10000");
        int current_closest_to_zero = 0;
        for(int index = 0;index < temperatures.length;index++) {
            if (abs(temperatures[index]) < current_closest_to_zero || index == 0){
                current_closest_to_zero = temperatures[index];
            }
        }
        return current_closest_to_zero;
    }
}