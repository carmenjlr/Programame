import java.util.Scanner;

public class ClarasOscuras413Correccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int numRepeticiones = sc.nextInt();
            for (int i = 0; i < numRepeticiones; i++) {
                int ancho = sc.nextInt();
                int alto = sc.nextInt();

                int totalCasillas = ancho * alto;

                // Si el total es 15:
                // Claras: 15 / 2 = 7.5 -> redondeamos arriba = 8
                // Oscuras: 15 / 2 = 7.5 -> redondeamos abajo = 7

                int oscuras = totalCasillas / 2;
                int claras = totalCasillas - oscuras;

                System.out.println(claras + " " + oscuras);
            }
        }
    }
}
