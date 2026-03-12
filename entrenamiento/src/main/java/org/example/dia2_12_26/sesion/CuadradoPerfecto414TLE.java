package org.example.dia2_12_26.sesion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuadradoPerfecto414TLE {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int numRepeticiones = Integer.parseInt(sc.readLine());
        for (int i = 0; i < numRepeticiones; i++) {
            int num = Integer.parseInt(sc.readLine());
            int contador = getContador(num);
            System.out.println(contador);
        }
    }

    private static int getContador(int num) {
        int numMultiplicado = num;
        int contador = 1;
        int operacion = Integer.MIN_VALUE;
        while (operacion != numMultiplicado) {
            numMultiplicado = num;
            contador++;
            numMultiplicado = numMultiplicado * contador;
            operacion = (int) Math.sqrt(numMultiplicado) * (int) Math.sqrt(numMultiplicado);
        }
        return contador;
    }
}
