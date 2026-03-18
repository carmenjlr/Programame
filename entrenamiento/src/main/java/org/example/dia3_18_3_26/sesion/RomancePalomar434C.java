package org.example.dia3_18_3_26.sesion;

import java.util.Scanner;

public class RomancePalomar434C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        for (int i = 1; i <= casos; i++) {
            int palomas = sc.nextInt();
            int cajas =  sc.nextInt();

            if (palomas > cajas){
                System.out.println("PRINCIPIO");

            } else {
                System.out.println("ROMANCE");
            }

        }

    }

}
