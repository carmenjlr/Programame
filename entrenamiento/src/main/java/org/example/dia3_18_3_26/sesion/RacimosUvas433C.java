package org.example.dia3_18_3_26.sesion;

import java.util.Scanner;

public class RacimosUvas433C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        while ((n =  sc.nextInt()) != 0){
            int uvas = 0;
            int niveles = 0;

            while (uvas < n){
                niveles++;
                uvas += niveles;
            }

            System.out.println(niveles);

        }

    }

}
