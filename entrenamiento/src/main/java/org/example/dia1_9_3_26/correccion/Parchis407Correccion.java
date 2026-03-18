package org.example.dia1_9_3_26.correccion;

import java.util.Scanner;

public class Parchis407Correccion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numCasillasTablero, posicion, movimiento;

        while (true) {
            numCasillasTablero = sc.nextInt();
            posicion = sc.nextInt();
            movimiento = sc.nextInt();

            if (numCasillasTablero == 0 && posicion == 0 && movimiento == 0){
                break;
            }

            int suma = posicion + movimiento;

            if (suma <= numCasillasTablero) {
                posicion = posicion + movimiento;
                System.out.println(posicion);
            } else {
                int rebote = suma -  numCasillasTablero;
                posicion = numCasillasTablero - rebote;
                System.out.println(posicion);
            }

        }

    }
}
