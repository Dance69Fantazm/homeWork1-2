package geekbrains.homeWork2;

import java.util.Random;
import java.util.Scanner;

public class Issue6 {

    public static void main(String[] args) {
        int maxCount = 3;
        int score = 3;
        Random random = new Random();
        int numberRand = random.nextInt(10);
        System.out.println("Угадайте число от 0 до 9, у вас " + maxCount + " попытки!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        for (int i = 1; i <= maxCount; i++) {
            int youNumber = scanner.nextInt();

            if (youNumber == numberRand) {
                System.out.println("Вы угадали!");
                break;
            } else if (youNumber > numberRand){
                score--;
                System.out.println("Вы не угадали!" + "\n У вас осталась " + score + " попыток" + "\n  Число больше загаданного");
            }else {
                score--;
                System.out.println("Вы не угадали!" + "\n У вас осталась " + score + " попыток" + "\n  Число меньше загаданного");
            }
        }
        scanner.close();
    }
}
