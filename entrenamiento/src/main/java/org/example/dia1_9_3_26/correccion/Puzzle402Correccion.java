import java.util.Scanner;
public class Puzzle402Correccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) break;
            int raiz = (int) Math.sqrt(n);
            int ladoLargo = 0;
            for (int i = raiz; i >= 1; i--) {
                if (n % i == 0) {
                    ladoLargo = n / i;
                    break;
                }
            }
            System.out.println(ladoLargo);
        }
    }
}