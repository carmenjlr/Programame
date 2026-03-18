package org.example.dia1_9_3_26.sesion;

import java.util.Scanner;

public class Parchis407WA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasillasTablero, posInicial, movimiento;
        while ((numCasillasTablero = sc.nextInt()) != 0 &&
                (posInicial = sc.nextInt()) != 0 &&
                (movimiento = sc.nextInt()) != 0) {

            while (movimiento > 0) {
                posInicial += movimiento;

                if (posInicial > numCasillasTablero) {
                    movimiento = posInicial - numCasillasTablero;
                    posInicial = numCasillasTablero - movimiento;
                }

                if (posInicial < 0) {
                    movimiento = posInicial + numCasillasTablero;
                    posInicial = movimiento;
                }
            }
            System.out.println(posInicial);
        }
//        while ((numCasillasTablero = sc.nextInt()) != 0 &&
//                (posInicial = sc.nextInt()) != 0 &&
//                (movimiento = sc.nextInt()) != 0) {
//            int posFinal = posInicial + movimiento;
//            while (posFinal >  numCasillasTablero) {
//                int vuelta = posFinal - numCasillasTablero;
//                posFinal = numCasillasTablero - vuelta;
//                ----
//                if (posFinal < 0) {
//                    vuelta =
//                }
//            }
//            System.out.println(posFinal);
//        }
    }
}
