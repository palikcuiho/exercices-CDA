package org.azertyuiop.tp3;

public class Thermometre {

    public int getTemperatureClosestToZero(int[] temperatures) {
        if (temperatures.length == 0)
            return 0;
        if (temperatures.length > 10000)
            throw new IllegalArgumentException("Le nombre de mesures ne doit pas excéder 10000");
        int currentSmallestValue = 0;
        for(int index = 0;index < temperatures.length;index++) {
            if (temperatures[index] < currentSmallestValue || index == 0 ){
                currentSmallestValue = temperatures[index];
            }
        }
        return currentSmallestValue;
    }
}