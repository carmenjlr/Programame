package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Elefantes411C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pesoMax;

        while ((pesoMax =  sc.nextInt()) != 0) {
            ArrayList<Integer> pesos = new ArrayList<>();

            int elefante;
            while((elefante = sc.nextInt()) != 0)
                pesos.add(elefante);

            int total = 0;
            int contador = 0;

            for (int peso : pesos) {
                total += peso;

                if (total <= pesoMax)
                    contador++;
                else
                    break;
            }

            System.out.println(contador);
        }
    }
}
