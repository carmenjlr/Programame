package org.example;

import java.util.Scanner;

public class loteria408 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidadDinero = sc.nextInt();
        int limiteDia =  sc.nextInt();
        int limiteSem = sc.nextInt();
        int limiteMes = sc.nextInt();

        int cantidadDia = 0;
        int cantidadSem = 0;
        int cantidadMes = 0;

        while (cantidadDinero >= limiteDia) {
            cantidadDinero -= limiteDia;
            if (cantidadDia <= limiteSem){
                cantidadDia++;
            }

            if (cantidadDia == limiteSem) {
                cantidadDinero -= limiteSem;
                cantidadSem++;

            } else if (cantidadSem >= 4) {
                cantidadDinero -= limiteMes;
                cantidadMes++;
            }

        }
        System.out.println(cantidadMes + " " + cantidadSem + " " + cantidadDia);

    }
}
