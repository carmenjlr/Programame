package org.example.dia2_12_26.correccion;

import java.util.Arrays;
import java.util.Scanner;

public class Hamburguesquin421 {

    static class Intervalo implements Comparable<Intervalo> {  //clase intervalo con compareTo
        int inicio;
        int fin;

        Intervalo(int inicio, int fin) {
            this.inicio = inicio;
            this.fin = fin;
        }


        public int compareTo(Intervalo otro) {   //para ordenar por inicio
            return this.inicio - otro.inicio;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int longitudCalle = sc.nextInt();
            int numeroRestaurantes = sc.nextInt();

            Intervalo[] lista = new Intervalo[numeroRestaurantes];

            for (int i = 0; i < numeroRestaurantes; i++) {
                int posicion = sc.nextInt();
                int radio = sc.nextInt();

                int inicio = Math.max(0, posicion - radio); //para que el intervale no sea menor a 0
                int fin = Math.min(longitudCalle, posicion + radio); //para que el intervalo no sea mayor a la longitud calle

                lista[i] = new Intervalo(inicio, fin);
            }

            Arrays.sort(lista); //ordeno la lista por inicio con compareTo automáticamente

            int usados = 0;
            int indice = 0; //por donde vamos
            int posicionActual = 0; //hasta donde esta cubierta la calle con restaurantes

            while (posicionActual < longitudCalle) {  //para cubrir la calle

                int mejorAlcance = posicionActual;

                //para buscar el intervalo que empiece antes o donde estamos ahora
                while (indice < numeroRestaurantes && lista[indice].inicio <= posicionActual) {
                    mejorAlcance = Math.max(mejorAlcance, lista[indice].fin); //me quedo con el que llega mas lejos
                    indice++;
                }

                if (mejorAlcance == posicionActual) {  //si no hay ningun intervalo que valga
                    usados = -1;
                    break;
                }

                posicionActual = mejorAlcance;
                usados++;
            }

            //restaurantes a cerrar
            if (usados == -1) {
                System.out.println(-1);
            } else {
                System.out.println(numeroRestaurantes - usados);
            }
        }
    }

}
