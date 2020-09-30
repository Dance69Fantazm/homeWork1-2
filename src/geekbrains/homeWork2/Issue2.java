package geekbrains.homeWork2;

import java.util.Arrays;

public class Issue2 {

    public static void main(String[] args) {
        final int SIZEMAS = 8;
        int [] numberMass = new int[SIZEMAS];

        for (int i = 0; i < numberMass.length; i++){
            numberMass[i] = i*3;
        }
        System.out.println(Arrays.toString(numberMass));

    }
}
