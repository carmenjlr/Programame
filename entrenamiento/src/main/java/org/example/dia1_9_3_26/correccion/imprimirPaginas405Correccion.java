package org.example.dia1_9_3_26.correccion;

import java.util.ArrayList;
import java.util.Scanner;

public class imprimirPaginas405Correccion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            ArrayList<Integer> paginas = new ArrayList<>();
            int pagina = sc.nextInt();

            if (pagina == 0) break;

            while (pagina != 0) {
                paginas.add(pagina);
                pagina = sc.nextInt();
            }

            ArrayList<Integer> pagSeguidas = new ArrayList<>();

            for (int i = 0; i < paginas.size(); i++) {
                pagSeguidas.add(paginas.get(i));

                if (i == paginas.size() - 1 || paginas.get(i + 1) != paginas.get(i) + 1) {
                    if (pagSeguidas.size() > 1) {
                        System.out.print(pagSeguidas.get(0) + "-" + pagSeguidas.get(pagSeguidas.size() - 1));
                    } else {
                        System.out.print(pagSeguidas.get(0));
                    }

                    if (i != paginas.size() - 1) {
                        System.out.print(",");
                    }

                    pagSeguidas.clear();
                }
            }
            System.out.println();
        }
    }
}

