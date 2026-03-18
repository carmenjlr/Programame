import java.util.Scanner;

public class EnCamposDeFutbol403Correccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long areaMinima = 45 * 90;   // 4.050
        long areaMaxima = 90 * 120;  // 10.800
        if (sc.hasNextInt()) {
            int numCasos = sc.nextInt();
            for (int i = 0; i < numCasos; i++) {
                long superficieTotal = sc.nextLong();
                long estimadoPeriodista = sc.nextLong();
                long minPosible = estimadoPeriodista * areaMinima;
                long maxPosible = estimadoPeriodista * areaMaxima;
                if (superficieTotal >= minPosible && superficieTotal <= maxPosible) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}