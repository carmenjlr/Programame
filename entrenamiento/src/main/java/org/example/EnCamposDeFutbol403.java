package org.example;


import java.util.Scanner;

public class EnCamposDeFutbol403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCamposMenor = 0, numCamposMayor = 0;
        int medidaCampoMenor = 45 * 90;
        int medidaCampoMayor = 90 * 120;

        int numComprobaciones = sc.nextInt();
        for (int i = 0; i < numComprobaciones; i++) {
            int medidaCampo = sc.nextInt();
            int campoMenor = medidaCampo, campoMayor = medidaCampo;
            int estimado = sc.nextInt();

            while (campoMenor > medidaCampoMenor) {
                numCamposMenor++;
                campoMenor -= medidaCampoMenor;
            }
            while (campoMayor > medidaCampoMayor) {
                numCamposMayor++;
                campoMayor -= medidaCampoMayor;
            }
            if (estimado <= numCamposMayor && estimado >= numCamposMenor) {
                System.out.println("SI");
            }
            else System.out.println("NO");
        }
    }
}