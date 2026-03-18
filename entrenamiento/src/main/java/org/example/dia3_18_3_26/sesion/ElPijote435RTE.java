package org.example.dia3_18_3_26.sesion;

import java.util.Scanner;

public class ElPijote435RTE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero = sc.next();
        int[] contador = new int[10];
        for (int i = 0; i < numero.length(); i++) {
            switch (numero.charAt(i)) {
                case '0': {
                    contador[0]++;
                    break;
                }
                case '1': {
                    contador[1]++;
                    break;
                }
                case '2': {
                    contador[2]++;
                    break;
                }
                case '3': {
                    contador[3]++;
                    break;
                }
                case '4': {
                    contador[4]++;
                    break;
                }
                case '5': {
                    contador[5]++;
                    break;
                }
                case '6': {
                    contador[6]++;
                    break;
                }
                case '7': {
                    contador[7]++;
                    break;
                }
                case '8': {
                    contador[8]++;
                    break;
                }
                case '9': {
                    contador[9]++;
                    break;
                }

                default: {
                    break;
                }
            }
        }
        boolean subnormal = true;
        for (int i = 0; i < contador.length - 1; i++) {
            if (contador[i] != contador[i + 1]) {
                subnormal = false;
                break;
            }
        }
        if (subnormal)
            System.out.println("subnormal");

        else
            System.out.println("no subnormal");
    }
}
