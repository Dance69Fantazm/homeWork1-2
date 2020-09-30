package geekbrains.homeWork2;

import java.util.Arrays;

public class Issue4 {

    public static void main(String[] args) {
        final int sizeMass = 8;

        int[][] dualMassDiagonal = new int[sizeMass][sizeMass];
        int lastIndex = dualMassDiagonal.length - 1;
        for (int i = 0; i < dualMassDiagonal.length; i++) {
            dualMassDiagonal[i][i] = dualMassDiagonal[i][lastIndex-i] = 1;
        }

        for (int[] mass : dualMassDiagonal) {
            System.out.println(Arrays.toString(mass));
        }
    }
}
