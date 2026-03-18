import java.util.Scanner;

public class TrifelioSolucion401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int numCasos = sc.nextInt();
        for (int i = 0; i < numCasos; i++) {
            String p1 = sc.next().toLowerCase();
            String p2 = sc.next().toLowerCase();
            p1 = p1.replace('v', 'b');
            p2 = p2.replace('v', 'b');
            if (p1.length() == p2.length() && !p1.equals(p2)) {
                String duplicada = p1 + p1;
                if (duplicada.contains(p2)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
