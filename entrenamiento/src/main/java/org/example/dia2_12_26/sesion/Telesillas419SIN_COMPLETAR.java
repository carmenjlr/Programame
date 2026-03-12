package org.example.dia2_12_26.sesion;

import java.util.Scanner;

public class Telesillas419SIN_COMPLETAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peso = 1, numPersonas = 1;
        while (peso != 0 && numPersonas != 0) {
            int pesoAcumulado = 0, contador = 0;
            peso = sc.nextInt(); numPersonas = sc.nextInt();
            int[] personas = new int[numPersonas];
            for (int i = 0; i < numPersonas; i++) {
                personas[i] = sc.nextInt();
                pesoAcumulado = pesoAcumulado + personas[i];
                if (pesoAcumulado > peso){
                    pesoAcumulado = personas[i];
                    contador++;
                } else if (pesoAcumulado == peso) {
                    pesoAcumulado = 0;
                    contador++;
                }
            }
            System.out.println(contador);
        }
    }
}
