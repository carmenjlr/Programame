package org.example.dia3_18_3_26.sesion;

import java.util.ArrayList;
import java.util.Scanner;

public class Organizandoloshangares429WA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hangares;

        while ((hangares = sc.nextInt()) != 0) {
            ArrayList<Integer> espaciosH = new ArrayList<>();
            for (int i = 0; i < hangares; i++) {
                espaciosH.add(sc.nextInt());
            }

            int numAviones = sc.nextInt();
            ArrayList<Integer> aviones = new ArrayList<>();
            for  (int i = 0; i < numAviones; i++) {
                aviones.add(sc.nextInt());
            }

            for (int i = aviones.size()-1; i >= 0; i--) {
                for (int j = espaciosH.size()-1; j >= 0; j--) {
                    if (espaciosH.get(j) >= aviones.get(i)) {
                        espaciosH.set(j, espaciosH.get(j) - aviones.get(i));
                        aviones.remove(i);

                        break;
                    }
                }
            }

            if (aviones.size() == 0)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
}
