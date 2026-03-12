package org.example.dia2_12_26.sesion;

import java.util.Scanner;

public class Nanaalbebedepapaymama417RTE {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String palabra = sc.next().toLowerCase();
            int contador = 1;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < palabra.length(); i++) {
                sb.append(palabra.charAt(i));

                StringBuilder sbCopia = new StringBuilder(sb);
                sbCopia.append(sb);

                if (palabra.contentEquals(sbCopia)) {
                    System.out.println(contador);
                    break;

                } else {
                    if (i == palabra.length() - 1) {
                        System.out.println(palabra.length());
                        break;
                    }

                    if (i == 0) {
                        sbCopia = new StringBuilder();

                        for (int j = 0; j < palabra.length(); j++)
                            sbCopia.append(sb);

                        if (palabra.contentEquals(sbCopia)) {
                            System.out.println(contador);
                            break;

                        } else
                            contador++;

                    } else
                        contador++;
                }
            }
        }
    }
