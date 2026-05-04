package org.example.dia2_12_26.correccion;

import java.util.Scanner;

public class CarreraCaracoles422 {

    static final int MOD = 46337;
    static final int MAX = 3001;

    public static void main(String[] args) {

        //se pre calcula combinaciones (combinacion[n][k]) con Triángulo de Pascal
        int[][] combinacion = new int[MAX][MAX];
        combinacion[0][0] = 1;
        for (int i = 1; i < MAX; i++) {
            combinacion[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                combinacion[i][j] = (combinacion[i-1][j-1] + combinacion[i-1][j]) % MOD;
            }
        }

        //se pre calcula números de Fubini fub[0..3000]
        int[] fub = new int[MAX];
        fub[0] = 1; //si hay 0 caracoles, 1 forma

        for (int n = 1; n < MAX; n++) {
            fub[n] = 0;
            for (int k = 1; k <= n; k++) {
                //k caracoles llegan primero: elegirlos y ordenar el resto
                fub[n] = (fub[n] + combinacion[n][k] * fub[n-k]) % MOD;
            }
        }

        //se leen los casos de prueba y se responde al caso concreto
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int numCaracoles = sc.nextInt();
            System.out.println(fub[numCaracoles]);
        }
    }
}

