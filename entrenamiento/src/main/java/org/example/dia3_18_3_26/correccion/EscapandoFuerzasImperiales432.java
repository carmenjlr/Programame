package org.example.dia3_18_3_26.correccion;

import java.util.Scanner;

public class EscapandoFuerzasImperiales432 {

    static int filas;
    static int columnas;
    static char[][] mapa;
    static boolean[][] visitado;
    static int destinoFila;
    static int destinoColumna;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            filas = sc.nextInt();
            columnas = sc.nextInt();
            mapa = new char[filas][columnas];
            visitado = new boolean[filas][columnas];

            int inicioFila = 0;
            int inicioColumna = 0;
            destinoFila = 0;
            destinoColumna = 0;

            //leo el mapa y guardo las posicones de S y F
            for (int i = 0; i < filas; i++) {
                String linea = sc.next();

                for (int j = 0; j < columnas; j++) {
                    mapa[i][j] = linea.charAt(j);

                    if (mapa[i][j] == 'S') {
                        inicioFila = i;
                        inicioColumna = j;
                    }

                    if (mapa[i][j] == 'F') {
                        destinoFila = i;
                        destinoColumna = j;
                    }
                }
            }

            //para buscar el camino y mostrar el resultado
            boolean hayCamino = buscarCamino(inicioFila, inicioColumna);

            if (hayCamino) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean buscarCamino(int filaActual, int columnaActual) {
        //si se sale del mapa
        if (filaActual < 0 || filaActual >= filas || columnaActual < 0 || columnaActual >= columnas) {
            return false;
        }

        //si ha pasado por la casilla o hay asteroide
        if (visitado[filaActual][columnaActual] || mapa[filaActual][columnaActual] == '*') {
            return false;
        }

        //si encuentra el camino
        if (filaActual == destinoFila && columnaActual == destinoColumna) {
            return true;
        }

        visitado[filaActual][columnaActual] = true;

        //probar las 4 direcciones
        boolean arriba = buscarCamino(filaActual - 1, columnaActual);
        boolean abajo = buscarCamino(filaActual + 1, columnaActual);
        boolean izquierda = buscarCamino(filaActual, columnaActual - 1);
        boolean derecha = buscarCamino(filaActual, columnaActual + 1);

        return arriba || abajo || izquierda || derecha;
    }

}
