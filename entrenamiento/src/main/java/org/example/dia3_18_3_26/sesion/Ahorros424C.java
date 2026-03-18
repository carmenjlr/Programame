package org.example.dia3_18_3_26.sesion;

import java.util.Scanner;

public class Ahorros424C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMov;
        while ((numMov = sc.nextInt()) != 0) {
            int ahorroTotal = 0, ahorroMax = 0;
            for (int i = 0; i < numMov; i++) {
                int operacion = sc.nextInt();
                ahorroTotal = ahorroTotal + operacion;
                if (ahorroTotal > ahorroMax) {
                    ahorroMax = ahorroTotal;
                }
            }

            System.out.println(ahorroTotal + " " + ahorroMax);
        }
    }
}
