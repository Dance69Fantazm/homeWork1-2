package geekbrains.homeWork2;

import java.util.Arrays;

public class MassLesson {

    public static void main(String[] args) {
        intMass(new int[]{1, 1, 0, 1, 0, 0, 1});
        emptyMass(new int[8]) ;
        sixMassTwo(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        diagonalMass(new int[8][8]);
        minMaxMass(new int[]{12, -5, 164, 4, 32, 8, 0});
    }
    // Задание №1
    private static void intMass(int[] zeroOne) {

        for (int i = 0; i < zeroOne.length; i++) {
            if (zeroOne[i] == 1) {
                zeroOne[i] = 0;
            } else {
                zeroOne[i] = 1;
            }
            }
        System.out.println(Arrays.toString(zeroOne));
    }
    // Задание №2
    private static void emptyMass(int [] numberMass){

        for (int i = 0; i < numberMass.length; i++){
        numberMass[i] = i*3;
        }
        System.out.println(Arrays.toString(numberMass));
    }
    // Задание №3
    private static void sixMassTwo(int [] mass) {
        int a = 6;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < a) {
                mass[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
    // Задание №4
    private static void diagonalMass(int[][] dualMassDiagonal) {
        int lastIndex = dualMassDiagonal.length - 1;

        for (int i = 0; i < dualMassDiagonal.length; i++) {
            dualMassDiagonal[i][i] = dualMassDiagonal[i][lastIndex-i] = 1;
        }
        for (int[] mass : dualMassDiagonal) {
            System.out.println(Arrays.toString(mass));
        }
    }
    // Задание №5
    private static void minMaxMass(int[] massMaxMin){
        int min = massMaxMin[0];
        int max = massMaxMin[0];

        for (int i = 0; i < massMaxMin.length; i++) {
            if (massMaxMin[i] < min)
                min = massMaxMin[i];
            if (massMaxMin[i] > max)
                max = massMaxMin[i];
        }
        System.out.println("Минимальное значение равно: " + min);
        System.out.println("Максимальное значение равно: " + max);
    }
}
