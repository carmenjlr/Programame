package org.example.dia2_12_26.sesion;

import java.util.Scanner;

public class ClarasOscuras413TLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numRepeticiones = sc.nextInt();
        for (int i = 1; i <= numRepeticiones; i++) {
            int filas = sc.nextInt();
            int columnas = sc.nextInt();
            int numCasillas = filas * columnas;
            int numCasillasBlancas = 0;
            int numCasillasNegras = 0;
            boolean casillaBlanca = true;
            for (int j = 1; j <= numCasillas; j++) {
                if (casillaBlanca) {
                    numCasillasBlancas++;
                    casillaBlanca = false;
                } else {
                    numCasillasNegras++;
                    casillaBlanca = true;
                }
            }
            System.out.println(numCasillasBlancas + " " + numCasillasNegras);
        }
    }
}
