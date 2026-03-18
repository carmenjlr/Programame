import java.util.Scanner;

public class CuadradoPerfecto414Correccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int numCasos = sc.nextInt();
            while (numCasos-- > 0) {
                long n = sc.nextLong(); // Usamos long para evitar desbordamientos
                System.out.println(resolver(n));
            }
        }
    }

    private static long resolver(long n) {
        long multiplicador = 1;
        long copiaN = n;

        // Probamos con el factor 2 por separado para ir más rápido
        int count2 = 0;
        while (copiaN % 2 == 0) {
            count2++;
            copiaN /= 2;
        }
        if (count2 % 2 != 0) multiplicador *= 2;

        // Probamos con los impares desde 3 hasta la raíz de n
        for (long i = 3; i * i <= copiaN; i += 2) {
            int count = 0;
            while (copiaN % i == 0) {
                count++;
                copiaN /= i;
            }
            // Si el factor i aparece un número impar de veces, lo necesitamos
            if (count % 2 != 0) {
                multiplicador *= i;
            }
        }

        // Si al final queda un número > 1, es un factor primo con exponente 1
        if (copiaN > 1) {
            multiplicador *= copiaN;
        }

        return multiplicador;
    }
}
