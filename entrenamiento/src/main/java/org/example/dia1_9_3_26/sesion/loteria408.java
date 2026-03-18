package org.example.dia1_9_3_26.sesion;

import java.util.Scanner;

public class loteria408 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            int cantidadDinero = sc.nextInt();
            int limiteDia =  sc.nextInt();
            int limiteSem = sc.nextInt();
            int limiteMes = sc.nextInt();

            int cantidadDia = 0;
            int cantidadSem = 0;
            int cantidadMes = 0;

            int totalDias = 0;
            int totalSem = 0;

            while (cantidadDinero >= limiteDia) {
                cantidadDinero -= limiteDia;
                totalDias += limiteDia;

                if (totalDias <= limiteSem){
                    cantidadDia++;
                }

                if (totalDias > limiteSem) {
                    totalSem = totalDias - limiteSem;
                    cantidadDinero -= totalSem;
                    cantidadSem++;
                }

                if (totalSem > limiteMes) {
                    int totalMes = totalSem - limiteMes;
                    cantidadDinero -= totalMes;
                    cantidadMes++;
                }

            }
            System.out.println(cantidadMes + " " + cantidadSem + " " + cantidadDia);
        }

    }
}
