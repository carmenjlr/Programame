package org.example.dia2_12_26.correccion;

import java.util.Scanner;

public class OvejasEscocesasSolucion412 {
    static int ancho, alto;
    static char[][] foto;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            ancho = sc.nextInt();
            alto = sc.nextInt();
            foto = new char[alto][ancho];
            for (int i = 0; i < alto; i++) {
                foto[i] = sc.next().toCharArray();
            }

            // 1. Limpiamos el fondo (siempre empieza en 0,0)
            rellenarFondo(0, 0);

            // 2. Buscamos si queda algún '.' que no fuera fondo
            boolean hayBlanca = false;
            for (int i = 0; i < alto; i++) {
                for (int j = 0; j < ancho; j++) {
                    if (foto[i][j] == '.') {
                        hayBlanca = true;
                        break;
                    }
                }
                if (hayBlanca) break;
            }

            System.out.println(hayBlanca ? "SI" : "NO");
        }
    }

    // Algoritmo Flood Fill recursivo
    static void rellenarFondo(int f, int c) {
        // Si nos salimos o no es un punto blanco, paramos
        if (f < 0 || f >= alto || c < 0 || c >= ancho || foto[f][c] != '.') {
            return;
        }

        // Marcamos como fondo procesado
        foto[f][c] = '*';

        // Mirar en las 4 direcciones (arriba, abajo, izquierda, derecha)
        rellenarFondo(f + 1, c);
        rellenarFondo(f - 1, c);
        rellenarFondo(f, c + 1);
        rellenarFondo(f, c - 1);
    }
}
