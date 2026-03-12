package org.example.dia1_9_3_26.sesion;

import java.util.ArrayList;
import java.util.Scanner;

public class inicialPaginas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> paginas = new ArrayList<>();
        int pagina;
        while ((pagina = sc.nextInt()) != 0) {
            paginas.add(pagina);
            System.out.println(paginas);
        }
        ArrayList<Integer> pagSeguidas = new ArrayList<>();
        for (int i = 0; i < paginas.size(); i++) {
            if (i != paginas.size() - 1) {
                if (paginas.get(i+1) == (paginas.get(i) + 1)) {
                    pagSeguidas.add(paginas.get(i));
                }
            }
            else {
                pagSeguidas.add(paginas.get(i));
                if (pagSeguidas.size() > 1) {
                    System.out.print(pagSeguidas.get(0) + "-" + pagSeguidas.get(pagSeguidas.size()-1) + ", ");
                }
                else System.out.print(pagSeguidas.get(0) + ", ");
                pagSeguidas.clear();
            }
        }
    }
}


