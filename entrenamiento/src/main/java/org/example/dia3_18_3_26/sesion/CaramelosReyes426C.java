package org.example.dia3_18_3_26.sesion;

import java.util.ArrayList;
import java.util.Scanner;

public class CaramelosReyes426C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            ArrayList<Integer> lista = new ArrayList<>();

            while (true) {
                int  n = sc.nextInt();
                if (n == 0) {
                    lista.add(0);
                    break;

                } else {
                    lista.add(n);
                }
            }

            if (lista.size() == 1 && lista.get(0) == 0) {
                break;
            }

            int numNinos = lista.size() - 1;
            int sumaCaramelos = 0;

            for (int n : lista) {
                sumaCaramelos += n;
            }

            if ((sumaCaramelos % numNinos) != 0){
                System.out.println("IMPOSIBLE");

            }else {
                System.out.println("REPARTO JUSTO");
            }

        }

    }

}
