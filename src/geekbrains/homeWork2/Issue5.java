package geekbrains.homeWork2;

import java.util.Arrays;

public class Issue5 {

    public static void main(String[] args) {

       int[] massMaxMin = {12, -5, 164, 4, 32, 8, 0};
       int min = massMaxMin[0];
       int max = massMaxMin[0];

       for (int i = 0; i < massMaxMin.length; i++) {
            if (massMaxMin[i] < min)
                min = massMaxMin[i];
            if (massMaxMin[i] > max)
                max = massMaxMin[i];

            /*min = Math.min(min, massMaxMin[i]);
            max = Math.max(max, massMaxMin[i]);*/
       }

        /*Arrays.sort(massMaxMin);
        int min = massMaxMin[0];
        int max = massMaxMin[massMaxMin.length - 1];*/

       System.out.println("Минимальное значение равно: " + min);
       System.out.println("Максимальное значение равно: " + max);
    }
}