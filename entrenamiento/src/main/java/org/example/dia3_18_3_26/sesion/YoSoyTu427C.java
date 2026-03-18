package org.example.dia3_18_3_26.sesion;

import java.util.Scanner;

public class YoSoyTu427C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numParentescos = sc.nextInt();
        sc.nextLine();
        for  (int i = 1; i <= numParentescos; i++) {
            String hijo = sc.nextLine();
            String projenitor = sc.nextLine();
            if (hijo.equals("Luke") && projenitor.equals("padre")) System.out.println("TOP SECRET");
            else System.out.println(hijo + ", yo soy tu " + projenitor);
        }
    }
}
