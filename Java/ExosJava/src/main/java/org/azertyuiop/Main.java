package org.azertyuiop;
import org.azertyuiop.tp1.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Ex1.calculerMoyenne(new int[]{10, 10, 10}));
        System.out.println(Ex1.calculerMoyenne(new int[]{15, 10, 5}));
        System.out.println(Ex2.calculerPrixTTC(100));
        System.out.println(Ex2.calculerPrixTTC(50));
//        System.out.println(Ex2.calculerPrixTTC(-4));
    }
}