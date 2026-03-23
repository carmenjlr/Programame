package org.example.dia2_12_26.correccion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RENUM418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < casos; i++) {
            HashMap<Integer, Integer> correspondencia = new HashMap<>();
            ArrayList<String[]> lineas = new ArrayList<>();
            String[] linea;

            int contador = 1;
            while (!(linea = sc.nextLine().toUpperCase().split(" "))[0].equals("0")) {
                // Se guardan las lineas originales
                // Se guarda en el HasMap, el numero original y su cambio
                // Se incrementa el contador para saber por cuanto hay que multiplicar el nuevo numero de linea
                lineas.add(linea);
                correspondencia.put(Integer.parseInt(linea[0]), 10 * contador);
                contador++;
            }

            for (int j = 0 ; j < lineas.size() ; j++) {
                // Se recorren las lineas guardadas anteriormente
                // Si el mensaje contiene un return, solo indicamos la nueva linea
                // En caso de ser otra cosa (GOTO, GOSUB) se indica su nueva linea y la nueva linea de a donde tiene que ir, en base al HasMap
                String[] l = lineas.get(j);
                if (l[1].equals("RETURN"))
                    System.out.printf("%d %s\n", 
                        correspondencia.get(Integer.parseInt(l[0])),
                        l[1]
                    );
                
                else 
                    System.out.printf("%d %s %d\n",
                        correspondencia.get(Integer.parseInt(l[0])),
                        l[1],
                        correspondencia.get(Integer.parseInt(l[2]))
                    );

                if (j == lineas.size() - 1)
                    System.out.println("---");
            }
        }

        sc.close();
    }
}
