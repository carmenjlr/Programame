package org.example.dia3_18_3_26.sesion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GeneticaJedi431C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numFamilias;

        while ((numFamilias = sc.nextInt()) != 0) {
            ArrayList<Integer> familias = new ArrayList<>();
            for (int i = 0; i < numFamilias; i++) {
                int numHijos =  sc.nextInt();
                int midi = sc.nextInt();

                ArrayList<Integer> hijos = new ArrayList<>();

                for (int j = 0; j < numHijos; j++) {
                    hijos.add(sc.nextInt());
                }
                Collections.sort(hijos);

                familias.add(hijos.get(hijos.size() - 1) * midi);
            }

            Collections.sort(familias);
            Collections.reverse(familias);
            for (int i = 0 ; i < familias.size() ; i++) {
                System.out.print(familias.get(i));

                if (i != familias.size()-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
