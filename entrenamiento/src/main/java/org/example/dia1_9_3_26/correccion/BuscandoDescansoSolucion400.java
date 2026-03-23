package org.example.dia1_9_3_26.correccion;

import java.util.Scanner;

public class BuscandoDescansoSolucion400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String fila = sc.next();
            int n = fila.length();

            int primeraX = -1;
            int ultimaX = -1;

            // Localizamos la primera y última X
            for (int i = 0; i < n; i++) {
                if (fila.charAt(i) == 'X') {
                    if (primeraX == -1) primeraX = i;
                    ultimaX = i;
                }
            }

            // 1. Caso borde izquierdo (camas antes de la primera X)
            // Si te pones en la posición 0, las camas entre tú y primeraX
            // son: primeraX - 1
            int maxDist = primeraX - 0;
            // Espera, si te pones en la 0, las camas vacías son de la 1 a la (primeraX-1)
            // Eso son exactamente primeraX - 1 camas.
            maxDist = primeraX - 1;

            // 2. Caso borde derecho (camas después de la última X)
            // Si te pones en la última posición (n-1), las camas entre
            // últimaX y tú son: (n-1) - últimaX - 1
            int distDer = (n - 1) - ultimaX - 1;
            if (distDer > maxDist) maxDist = distDer;

            // 3. Casos intermedios
            int anteriorX = primeraX;
            for (int i = primeraX + 1; i <= ultimaX; i++) {
                if (fila.charAt(i) == 'X') {
                    int hueco = i - anteriorX - 1;
                    if (hueco > 0) {
                        // Al sentarte en el medio de 'hueco' camas,
                        // la distancia al vecino más cercano es:
                        int d = (hueco - 1) / 2;
                        if (d > maxDist) maxDist = d;
                    }
                    anteriorX = i;
                }
            }
            // Caso especial: El problema garantiza que hay al menos una X y un punto.
            // Si maxDist quedó en negativo por algún borde pequeño, el mínimo es 0.
            System.out.println(Math.max(0, maxDist));
        }
    }
}