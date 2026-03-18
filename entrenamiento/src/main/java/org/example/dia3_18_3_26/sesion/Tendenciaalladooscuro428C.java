package org.example.dia3_18_3_26.sesion;

import java.util.ArrayList;
import java.util.Scanner;

public class Tendenciaalladooscuro428C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            int num = sc.nextInt();
            ArrayList<Integer> lista = new ArrayList<Integer>();

            while (num >= 5) {
                lista.add(num % 5);
                num = num / 5;
            }

            lista.add(num);

            int contador = 0;
            for (int numero : lista) {
                if (numero == 4)
                    contador++;

                if (contador == 2)
                    break;
            }

            System.out.println(contador == 2 ? "SI" : "NO");
        }
    }
}
