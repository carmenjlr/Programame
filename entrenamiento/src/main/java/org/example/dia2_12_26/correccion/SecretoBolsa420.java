package org.example.dia2_12_26.correccion;

import java.util.Scanner;

public class SecretoBolsa420 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 1; i <= casos; i++) {
            int resultado = sc.nextInt();
            String numeros = sc.next();
            int contador = 0;

            for (int i1 = 0; i1 < numeros.length(); i1++) {
                int total = 0;
                for (int j1 = i1 + 1; j1 < numeros.length(); j1++) {
                    int suma = Integer.parseInt(String.valueOf(numeros.charAt(i1))) + Integer.parseInt(String.valueOf(numeros.charAt(j1)));
                    if (suma == resultado) {
                        contador ++;
                        i1 = j1;

                    } else {
                        for (int i2 = i1; i2 < numeros.length(); i2++) {
                            total = Integer.parseInt(String.valueOf(numeros.charAt(i2)));

                            try {
                                for (int j2 = i2 + 1; j2 < numeros.length(); j2++) {
                                    total += Integer.parseInt(String.valueOf(numeros.charAt(j2)));

                                    if (total == resultado) {
                                        contador++;
                                        i1 = j2;
                                        throw new RuntimeException();

                                    } else if (total > resultado) {
                                        i1++;
                                        throw new RuntimeException();
                                    }
                                }
                            } catch (RuntimeException e) {
                                break;
                            }
                        }

                    }
                }

            }
            System.out.println(contador);

        }


    }

}
