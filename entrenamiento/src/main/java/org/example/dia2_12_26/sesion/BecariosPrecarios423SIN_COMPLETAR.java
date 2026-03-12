package org.example.dia2_12_26.sesion;

import java.util.Scanner;

public class BecariosPrecarios423SIN_COMPLETAR {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numjefes = sc.nextInt();
        String jerarquia = sc.next();

        int contador = 0;
        int contadorPosicion = 0;
        int contadorCeros = 0;

        for (int i = 0; i < jerarquia.length(); i++) {
            int num = Integer.parseInt(String.valueOf(jerarquia.charAt(i)));

            if (num != 0){
                contador++;
            }

            if (contador >= numjefes){
                for (int i1= jerarquia.length(); i1 > 0; i1 --){
                    int total = jerarquia.charAt(i1);

                    if (total != 0){
                        contadorPosicion ++;
                    }

                    while (contadorPosicion < numjefes){
                        contadorCeros++;
                        contadorPosicion++;
                    }

                }
            }
        }
        System.out.println(contadorCeros);

    }

}
