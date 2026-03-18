package org.example.dia2_12_26.correccion;

import java.util.Scanner;

public class BecariosPrecarios423Correccion {

//    OPCION RECURSIVIDAD
//    private static Scanner sc = new Scanner(System.in);
//    private static int knumJefes = 0;
//    private static int contadorPrecarios = 0;


    public static void main(String[] args) {

//        OPCION RECURSIVIDAD
//        while (sc.hasNext()) {
//
//            knumJefes = sc.nextInt();
//            contadorPrecarios = 0;
//
//            leerJerarquia(0);
//
//            System.out.println(contadorPrecarios);
//
//        }

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int knumJefes = sc.nextInt();
            int contadorPrecarios = 0;

            int[] hijosPendientes = new int[10000];  //subordinados de cada jefe por procesar
            int nivelActual = 0;

            hijosPendientes[0] = 1; // el jefe supremo

            while (nivelActual >= 0) {

                int num = sc.nextInt();

                hijosPendientes[nivelActual]--;

                if (num == 0) { // es un becario
                    if (nivelActual >= knumJefes) {
                        contadorPrecarios++;
                    }
                } else {
                    nivelActual++;
                    hijosPendientes[nivelActual] = num;
                    continue;
                }

                while (nivelActual >= 0 && hijosPendientes[nivelActual] == 0) {
                    nivelActual--;
                }
            }

            System.out.println(contadorPrecarios);
        }

    }
}


//    OPCION RECURSIVIDAD
//    public static void leerJerarquia(int nivelActual) {
//        int num = sc.nextInt(); //numero de subordinados
//
//        if (num == 0) { //es becario
//            if (nivelActual >= knumJefes) {
//                contadorPrecarios++;
//            }
//            return;
//        }
//
//        for (int i = 0; i < num; i++) {
//            leerJerarquia(nivelActual + 1);
//        }
//
//    }
