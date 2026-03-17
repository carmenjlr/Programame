package org.example.dia2_12_26.correccion;

import java.util.Scanner;

public class SecretoBolsa420 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        for (int i = 1; i <= casos; i++) {

            int objetivo = sc.nextInt();
            String numeros = sc.next();

            int contador = 0;
            int suma = 0;
            int izquierda = 0;  //inicio del bloque de numeros

            for (int i1 = 0; i1 < numeros.length(); i1++) {
                suma += Integer.parseInt(String.valueOf(numeros.charAt(i1)));

                while (suma > objetivo) {
                    suma -= Integer.parseInt(String.valueOf(numeros.charAt(izquierda)));
                    izquierda++;
                }

                if (suma == objetivo) {
                    contador ++;
                }

            }
            System.out.println(contador);

        }
    }
}
