package org.example.dia2_12_26.sesion;

import java.util.ArrayList;
import java.util.Scanner;

public class FoxyelPatoDonald416C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos;

        while ((casos = sc.nextInt()) != 0) {
            ArrayList<String[]> fechas = new ArrayList<>();

            for  (int i = 1; i <= casos; i++)
                fechas.add(sc.next().split("/"));

            boolean coincidentes = false;

            for (int i = 0; i < fechas.size(); i++) {
                for (int j = i+1; j < fechas.size(); j++) {
                    if (
                            fechas.get(i)[0].equals(fechas.get(j)[0]) &&
                            fechas.get(i)[1].equals(fechas.get(j)[1])
                    ) {
                        coincidentes = true;
                        break;
                    }
                }

                if (coincidentes)
                    break;
            }

            System.out.println(coincidentes ? "SI" : "NO");
        }
    }
}
