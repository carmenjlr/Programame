package org.example.dia3_18_3_26.correccion;

import java.util.ArrayList;
import java.util.Collections;
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

            Collections.sort(espaciosH, Collections.reverseOrder());

            // Tras recoger todos los huecos en los hangares y los aviones, se ordenan los huecos de los hangares para ir de mayor a menor
            for (int i = 0 ; i < aviones.size() ; i++) {
                for (int j = 0 ; j < espaciosH.size() ; j++) {
                    if (espaciosH.get(j) >= aviones.get(i)) { 
                        // Si la nave entra, se resta el espacio al hangar, 
                        // se pone la nave a 0 para saber que ha entrado y se reeordena la lista de los hangares para ir por el mayor.
                        // Se pasa a la siguiente nave
                        espaciosH.set(j, espaciosH.get(j) - aviones.get(i));
                        aviones.set(i, 0);
                        Collections.sort(espaciosH, Collections.reverseOrder());

                        break;
                    }
                }
            }

            boolean todosEntran = true;

            for (int avion : aviones) {
                if (avion != 0) {
                    todosEntran = false;
                    break;
                }
            }

            // Se revisa la lista de los aviones para saber si han entrado todos o no
            System.out.println(todosEntran ? "SI" : "NO");
        }

        sc.close();
    }
}
