package geekbrains.homeWork2;

import java.util.Arrays;

public class Issue1 {

    public static void main(String[] args) {

        int [] zeroOne = {1, 1, 0, 1, 0, 0, 1};

        // в принципе  получилось, но только код мой меня не устраиват вместо 7 я бы поставил длинну массива,
        // но не знаю как, ( ..разобрался .length) не меняя заданный массив, можно сделать так: int [] zeroOne = new int[element], где
        // int element = 7; тогда придется заполнять матрицу отдельно
        for (int i = 0; i < zeroOne.length; i++) {
            if (zeroOne[i] == 1) {
                zeroOne[i] = 0;
            } else {
                zeroOne[i] = 1;
            }
        }
            System.out.println(Arrays.toString(zeroOne));
    }
}
