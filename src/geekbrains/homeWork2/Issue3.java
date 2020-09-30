package geekbrains.homeWork2;

import java.util.Arrays;

public class Issue3 {

    public static void main(String[] args) {
        int a = 6;
        int [] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < a) {
                mass[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
