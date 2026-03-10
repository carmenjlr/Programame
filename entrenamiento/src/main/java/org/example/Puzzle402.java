package org.example;

import java.util.Scanner;

public class Puzzle402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPiezasPuzzle = sc.nextInt();
        int numColumnasMax = Integer.MAX_VALUE;
        int numFilasMenor = Integer.MIN_VALUE;
        for (int i = numPiezasPuzzle - 1; i > 0; i--) {
            int solucionPosible = numPiezasPuzzle % i;
            int numColumnasCandidata, numFilasCandidata;
            if (solucionPosible == 0) {
                if (i > numPiezasPuzzle / i) {
                    numColumnasCandidata = i;
                    numFilasCandidata = numPiezasPuzzle / i;
                }
                else {
                    numColumnasCandidata = numPiezasPuzzle / i;
                    numFilasCandidata = numPiezasPuzzle / i;
                }
                if (numColumnasMax - numFilasMenor > numColumnasCandidata - numFilasMenor) {
                    numColumnasMax = numColumnasCandidata;
                    numFilasMenor = numFilasCandidata;
                }
            }
        }
        System.out.println(numColumnasMax);
    }
}
