package geekbrains.homeWork1;

public class Main {
    public static void main(String[] args) {

        // Задание №2.
        byte number1 = 12;
        short number2 = 14;
        int number3 = 22;
        long number4 = 1000000000000L;
        float number5 = 31.0f;
        double number6 = 3.14;
        char chr = 56;
        boolean isBlack = true;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
        System.out.println(chr);
        System.out.println(isBlack);

        String str = "Привет Мир!";
        System.out.println(str);

        System.out.println(calculate(20, 33, 44, 25));
        System.out.println(number10and20(11, 3));
        numberPositiveOrNegative(-25);
        testTern(-5);
        testTern(0);
        testTern(5);
        numberOne(-9);
        numberOne(5);
        numberOne(0);
        nameForYou("Астеротте");
        printLeapYear(1);
        printLeapYear(4);
        printLeapYear(40);
        printLeapYear(100);
        printLeapYear(300);
        printLeapYear(400);
        printLeapYear(700);
        printLeapYear(2019);
        printLeapYear(2020);
    }

    // Задание №3.
    public static int calculate(int a, int b, int c, int d){
        int result = a*(b+(c/d));
        return result;
    }

    // Задание №4.
    public static boolean number10and20(int x1, int x2){
        int sum = x1+x2;
        return (sum > 10 && sum < 20);
    }

    // Задание №5.
    public static void numberPositiveOrNegative(int digit){
        if (digit < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    private static void testTern (int digit) {
        // (условие) ? (true) : (false)
        String resNumberLine = ((digit < 0) ? "Отрицательное" : "Положительное");
        System.out.println(digit + " это " + resNumberLine + " число!");
    }

    // Задание №6.
    public static boolean numberOne(int x){
        return  x < 0;
    }

    // Задание №7.
    public static void nameForYou(String name){
        System.out.println("Привет, " + name + "!");
    }

    // Задание №8.
    public static void printLeapYear(int year) {
        boolean isLeap = isLeapYear(year);
        if (isLeap) {
            System.out.println(year + " is leap year\n");
        } else {
            System.out.println(year + " is not leap year\n");
        }
    }
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 == 0 || year % 400 == 0);
    }
}