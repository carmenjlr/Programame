package org.example.dia3_18_3_26.correccion;

import java.util.Scanner;

public class EscapandoFuerzasImperiales432 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int filas = sc.nextInt();
            int columnas = sc.nextInt();
            char[][] mapa = new char[filas][columnas];

            int inicioFilas = 0, inicioColumnas = 0;

            for (int i = 0; i < filas; i++) {
                String linea = sc.next();

                for (int j = 0; j < columnas; j++) {
                    mapa[i][j] = linea.charAt(j);

                    if (mapa[i][j] == 'S') {
                        inicioFilas = i;
                        inicioColumnas = j;
                    }
                }
            }
        }

    }
}
