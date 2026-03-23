package org.example.dia2_12_26.correccion;

import java.util.Scanner;

public class Nanaalbebedepapaymama417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = "";

        while (sc.hasNext()) {
            palabra = sc.next().toLowerCase();

            int contador = 1;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < palabra.length(); i++) {
                sb.append(palabra.charAt(i));

                int sbLen = sb.length();

                if (palabra.length() % sbLen == 0) { 
                    // Si al juntar letras, es divisible entre la long total, se multiplica hasta llegar a la long
                    // y comparar si es igual o no
                    StringBuilder sbCopia = new StringBuilder();

                    for (int j = 0; j < (palabra.length() / sb.length()); j++)
                        sbCopia.append(sb);

                    if (palabra.contentEquals(sbCopia)) {
                        System.out.println(contador);
                        break;
                    }
                }
            
                // Si no es divisible y al llegar a la ultima letra no se ha obtenido nada, se dice la longitud de la palabra
                if (i == palabra.length() - 1) {
                    System.out.println(palabra.length());
                    break;
                }

                contador++;
            }
        }
    }
}
