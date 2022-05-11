import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        printABC();
        int n = inputInt();
        evenNumber(n);
        System.out.println("Введите числа для проверки на максимальное число: ");
        float a = inputFloat();
        float b = inputFloat();
        float c = inputFloat();
        System.out.println("Наибольшее из чисел " + a + " " + b + " " + c + " : " + maxNumber(a, b, c));
        Random random = new Random();
        restOfWork(random.nextInt(28800));
        table();
        int temp[] = {1, 2, 3, 4, 5};
        System.out.println("Cреднее арифметическое :" + meanArray(temp));
        System.out.println("Наибольшее число :" + maxArray(temp));
    }

    private static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect;
        float n = 0;
        do {
            isCorrect = true;
            try {
                n = Float.parseFloat(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Вы ввели неверные данные, повторите  ввод");
                isCorrect = false;
            }
            if (isCorrect && (n > Float.MAX_VALUE)) {
                System.out.println("Вы ввели неверные данные, повторите  ввод");
                isCorrect = false;
            }
        } while (!isCorrect);
        return n;
    }

    private static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect;
        int n = 0;
        do {
            isCorrect = true;
            System.out.print("Введите целое число для проверки на четность: ");
            try {
                n = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Вы ввели неверные данные, повторите  ввод");
                isCorrect = false;
            }
            if (isCorrect && ((n > Integer.MAX_VALUE) || (n < Integer.MIN_VALUE))) {
                System.out.println("Вы ввели слишком большое число!");
                isCorrect = false;
            }
        } while (!isCorrect);
        return n;
    }

    private static void printABC() {
        System.out.println("Английский алфавит: ");
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void evenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Число " + number + " чётное");
        } else {
            System.out.println("Число " + number + " нечётное");
        }
    }

    private static float maxNumber(float a, float b, float c) {
        float max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }

    private static void restOfWork(int restSec) {
        float restHour = (float) restSec / 3600;
        System.out.println("Осталось от " + (int) restHour + " до " + ((int) restHour + 1));
    }

    private static void table() {
        System.out.println("          byte  \tshort\tchar  \tint  \tlong \tfloat \tdouble \tboolean");
        System.out.println("byte   |   т   |\t ня  |\t я  |\t ня |\t ня |\t ня  |\t ня   |\t  х   ");
        System.out.println("short  |   я   |\t т   |\t я  |\t ня |\t ня |\t ня  |\t ня   |\t  х   ");
        System.out.println("char   |   т   |\t я   |\t т  |\t ня |\t ня |\t ня  |\t ня   |\t  х   ");
        System.out.println("int    |   я   |\t я   |\t я  |\t т  |\t ня |\t ня  |\t ня   |\t  х   ");
        System.out.println("long   |   я   |\t я   |\t я  |\t я  |\t т  |\t ня  |\t ня   |\t  х   ");
        System.out.println("float  |   я   |\t я   |\t я  |\t я  |\t я  |\t т   |\t ня   |\t  х   ");
        System.out.println("double |   я   |\t я   |\t я  |\t я  |\t я  |\t я   |\t т    |\t  х   ");
        System.out.println("boolean|   х   |\t х   |\t х  |\t х  |\t х  |\t х   |\t х    |\t  т   ");
    }

    private static float meanArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
            ;
        }
        return max;
    }
}
