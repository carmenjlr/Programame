package org.example.dia2_12_26.correccion;

import java.util.Scanner;

public class RestaYAmusSolucion4015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong()) {
            long n = sc.nextLong();
            if (n == 0) break; // Fin de la entrada

            // Un número puede llegar a 0 si y solo si es múltiplo de 9
            if (n % 9 == 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
