package org.example.dia2_12_26.correccion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Telesillas419 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peso, numPersonas;

        while (
               (peso = sc.nextInt())        != 0 
            && (numPersonas = sc.nextInt()) != 0
        ) {
            ArrayList<Integer> personas = new ArrayList<>();
            
            // Se guardan y ordenan las personas por su peso
            for (int i = 0; i < numPersonas; i++) 
                personas.add(sc.nextInt());
            
            Collections.sort(personas);

            int izq = 0, der = personas.size() - 1, contador = 0;

            while (izq <= der) {
                // Recorremos las posiciones comparando la izquierda con la derecha
                // Si al juntarlas dan el peso correcto, avanzamos de numero en ambos cursores
                // Si no da el peso correcto, avanzamos solo en el de la izq (mas pesado) y comparamos otra pareja
                if (personas.get(izq) + personas.get(der) <= peso) {
                    izq++;
                    der--;

                } else {
                    der--;
                }
                contador++;
            }

            System.out.println(contador);
        }

        sc.close();
    }
}
