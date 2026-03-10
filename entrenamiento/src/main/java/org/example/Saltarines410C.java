package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Saltarines410C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            String caso = sc.next();
            ArrayList<Integer> lista = new ArrayList<>();
            for (int j = 0; j < caso.length(); j++) {
                lista.add(Integer.parseInt(String.valueOf(caso.charAt(j))));
            }
            boolean[] pisado = new boolean[lista.size()];
            int saltosHechos = 0;
            int posicionActual = 0;
            while (!pisado[posicionActual]) {
                if (saltosHechos > 0) pisado[posicionActual] = true;
                int suma = lista.get(posicionActual);
                posicionActual += suma;
                while (posicionActual >= lista.size()) posicionActual -= lista.size();
                saltosHechos ++;
            }
            boolean todosTrue = true;
            for (int j = 0; j < lista.size(); j++) {
                if (!pisado[j]) todosTrue = false;
            }
            if (todosTrue) {
                System.out.println("SALTARINES");
            } else System.out.println("NORMALES");
        }
    }
}
