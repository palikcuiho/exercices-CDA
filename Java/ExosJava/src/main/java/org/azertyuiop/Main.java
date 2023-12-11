package org.azertyuiop;
import org.azertyuiop.tp1.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Ex1.calculerMoyenne(new int[]{10, 10, 10}));
        System.out.println(Ex1.calculerMoyenne(new int[]{15, 10, 5}));
        System.out.println(Ex2.calculerPrixTTC(100));
        System.out.println(Ex2.calculerPrixTTC(50));
//        System.out.println(Ex2.calculerPrixTTC(-4));
        System.out.println(Ex3.estUnPalindrome(121));
        System.out.println(Ex3.estUnPalindrome(123));
//        System.out.println(Ex3.estUnPalindrome(-3));
        System.out.println(Ex4.contientUnDoublon(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))));
        System.out.println(Ex4.contientUnDoublon(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1))));
    }
}