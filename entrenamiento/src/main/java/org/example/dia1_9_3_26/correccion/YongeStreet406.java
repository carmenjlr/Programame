package org.example.dia1_9_3_26.correccion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class YongeStreet406 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String calle = sc.nextLine();
            char[] resultado = new char[calle.length()];
            Arrays.fill(resultado, '.');

            List<Character> coches = new ArrayList<>();

            for (int i = 0; i < calle.length(); i++) {
                char c = calle.charAt(i);

                if (c == '|') {
                    resultado[i] = '|';
                    int pos = i - 1;

                    for (int j = coches.size() - 1; j >= 0; j--) {
                        resultado[pos] = coches.get(j);
                        pos = pos - 1;
                    }

                    coches.clear();

                } else if (c != '.') {
                    coches.add(c);
                }
            }

            int numConsulta = sc.nextInt();

            for (int i = 0; i < numConsulta; i++) {
                int posicion = sc.nextInt();
                System.out.print(resultado[posicion - 1]);

                if (i < numConsulta - 1){
                    System.out.print(" ");
                }
            }
            sc.nextLine();

            System.out.println();
        }
    }


}
