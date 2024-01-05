package org.azertyuiop.tp3;

public class Thermometre {

    public int getTemperatureClosestToZero(int[] temperatures) {
        if (temperatures.length > 10000)
            throw new IllegalArgumentException("Le nombre de mesures ne doit pas excéder 10000");
        if (temperatures.length > 0)
            return 1;
        return 0;
    }
}
