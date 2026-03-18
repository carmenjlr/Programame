package org.example.dia1_9_3_26.correccion;

import java.util.Scanner;

public class loteria408Correccion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            long cantidadDinero = sc.nextLong();
            long limiteDia =  sc.nextLong();
            long limiteSem = sc.nextLong();
            long limiteMes = sc.nextLong();

            //Calculo los meses completos y se resta 1 para que si el premio es
            //justo el límite del mes, no salta al siguiente mes
            long numMeses = (cantidadDinero - 1) / limiteMes;
            long restoMes = cantidadDinero - (numMeses * limiteMes);

            //con lo que queda del útlimo mes, calculo semanas
            long numSemanas = (restoMes - 1) / limiteSem;
            long restoSem = restoMes - (numSemanas * limiteSem);

            //con lo que queda de la útlima semana, calculo dias
            //divido dinero sobrante entre el limite diario
            long numDias = (restoSem + limiteDia - 1) / limiteDia;

            System.out.println(numMeses + " " + numSemanas + " " + numDias);
        }

    }
}
