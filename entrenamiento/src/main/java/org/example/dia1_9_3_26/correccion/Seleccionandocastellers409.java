package org.example.dia1_9_3_26.correccion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Seleccionandocastellers409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        // Se recogen los datos y se ordenan para comparar por bloques
        for (int c = 0 ; c < casos ; c++) {
            int bloque = sc.nextInt();
            int personas = sc.nextInt();

            ArrayList<Integer> alturas = new ArrayList<>();

            for (int i = 0 ; i < personas ; i++) 
                alturas.add(sc.nextInt());

            Collections.sort(alturas);

            int contador = 0;
            int i = 0;

            while (i < alturas.size()) { // En caso de que la diferencia entre la primera persona y la ultima de ese bloque no sea mayor que 15, se suma uno al contador
                if (
                    (i + bloque) <= alturas.size() 
                    && (alturas.get(i + (bloque - 1)) - alturas.get(i)) <= 15
                ) {
                    contador++;
                    i += bloque;

                } else {
                    i++;
                }
            }

            System.out.println(contador);
        }

        sc.close();
    }
}
