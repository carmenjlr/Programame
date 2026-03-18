package org.example.dia3_18_3_26.sesion;

import java.util.Scanner;

public class PruebasYoda430C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPruebas = 1;
        while (numPruebas != 0) {
            numPruebas = sc.nextInt();
            boolean[] pruebasCompletadas = new boolean[numPruebas];
            int contadorDias = 0;
            for (int i = 0; i < numPruebas; i++) {
                contadorDias++;
                int diaPrueba = sc.nextInt();
                int diasIntervaloPrueba = sc.nextInt();
                while (!pruebasCompletadas[i]) {
                    if (contadorDias == diaPrueba) pruebasCompletadas[i] = true;
                    else if (contadorDias < diaPrueba) contadorDias++;
                    else diaPrueba += diasIntervaloPrueba;
                }
            }
            if (contadorDias != 0) System.out.println(contadorDias);
        }
    }
}
