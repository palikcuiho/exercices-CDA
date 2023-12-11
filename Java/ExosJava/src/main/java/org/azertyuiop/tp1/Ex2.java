package org.azertyuiop.tp1;

public class Ex2 {
    public static float calculerPrixTTC(float prixHT) throws Exception {
        if (prixHT < 0)
            throw new Exception("Le prix doit être positif");
        return (float) (prixHT*1.2);
    }
}
