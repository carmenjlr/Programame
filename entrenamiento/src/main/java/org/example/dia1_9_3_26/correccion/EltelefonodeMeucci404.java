package org.example.dia1_9_3_26.correccion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EltelefonodeMeucci404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Referencia de los distintos numeros romanos
        ArrayList<String> numerosRomanos = new ArrayList<>(Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII","VIII", "IX", "X"));

        String num;

        while (sc.hasNextLine()) {
            num = sc.nextLine().toUpperCase();

            // Contador de cada caso que se mira, al final queda el mayor numero de casos obtenidos
            int[] contador = new int[num.length() + 1];
            contador[0] = 1;

            // Recorremos el numero que nos indican
            for (int i = 1 ; i <= num.length() ; i++) {

                // Como maximo el numero tiene 4 digitos y como minimo 1, entonces verificamos de 1 a 4 digitos
                for (int j = 1 ; j <= 4 ; j++ ) {
                    if (i - j >= 0) { // Esto nos sirve para saber si tenemos mas digitos detras para comprobar combinaciones
                        String numSustraido = num.substring(i - j, i); // Sustraemos la combinacion

                        if (numerosRomanos.contains(numSustraido))
                            contador[i] += contador[i - j]; // Si la conbinacion esta en nuestra referencia, sumamos las combinaciones anteriores a la posicion en la que estamos
                    }
                }
            }

            System.out.println(contador[num.length()]);
        }

        sc.close();
    }
}
