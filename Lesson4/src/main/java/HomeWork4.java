import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    static Random random = new Random();

    public static void main(String[] args) {
//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.
        int day = random.nextInt(7) + 1;
        switch (day) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6, 7:
                System.out.println("выходной");
                break;
        }

//2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа
        int ameba = 1;
        for (int i = 3; i < 24; i += 3) {
            ameba *= 2;
            System.out.println("Через " + i + " : " + ameba);
        }


//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
        int number = inputInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        short length = 0;
        int temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        String check = "";
        if (number > 0) {
            check = "положительное";
        } else if (number < 0) {
            check = "отрицательное";
        } else {
            check = "не положительное и не отрицательное";
        }
        System.out.println(number + " -это " + check + " число, количество цифр = " + length);


//4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
        int month = inputInt(1, 12);
        if (month == 2) {
            day = inputInt(1, 31);
        } else if ((month <= 7 && month % 2 == 1) || (month >= 8 && month % 2 == 0)) {
            day = inputInt(1, 31);
        } else {
            day = inputInt(1, 30);
        }
        float data = month + (float) day / 100;
        String sign = "";
        if (data >= 1.21) {
            sign = "Водолей";
        } else if (data >= 2.20) {
            sign = "Рыбы";
        } else if
        (data >= 3.21) {
            sign = "Овен";
        } else if (data >= 4.21) {
            sign = "Телец";
        } else if (data >= 5.22) {
            sign = "Близнецы";
        } else if (data >= 6.22) {
            sign = "Рак";
        } else if (data >= 7.23) {
            sign = "Лев";
        } else if (data >= 8.22) {
            sign = "Дева";
        } else if (data >= 9.24) {
            sign = "Весы";
        } else if (data >= 10.24) {
            sign = "Скорпион";
        } else if (data >= 11.23) {
            sign = "Стрелец";
        } else if ((data >= 12.23) || (data <= 1.20)) {
            sign = "Козерог";
        }
        System.out.println("Ваш знак задика: " + sign);


        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println("Операции:" + operation(1));
        System.out.println("Операции:" + operation(0));
        System.out.println("Количество нечетных элементов: " + calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(103);
        countDevs(11);
        foobar(6);
        foobar(10);
        foobar(15);
        printPrimeNumbers();
    }

    private static int inputInt(int minValue, int maxValue) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect;
        int n = 0;
        do {
            isCorrect = true;
            System.out.print("Введите целое число: ");
            try {
                n = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Вы ввели неверные данные, повторите  ввод");
                isCorrect = false;
            }
            if (isCorrect && ((n > maxValue) || (n < minValue))) {
                System.out.println("Вы ввели число в неправильном диапазоне!");
                isCorrect = false;
            }
        } while (!isCorrect);
        return n;
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        int n = inputInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else if (number == 0) {
            number = 10;
        }
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 1) {
                count++;
            }
        }
        return count;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        String devs = "";
        int lastNumber = count % 100;
        if ((lastNumber < 11) || (lastNumber > 14)) {
            lastNumber = count % 10;
            if (lastNumber == 2) {
                devs = "программист";
            }
            if (lastNumber >= 2 && lastNumber <= 4) {
                devs = "программиста";
            }
            if (lastNumber >= 5) {
                devs = "программистов";
            }
        } else {
            devs = "программистов";
        }
        System.out.println(count + devs);
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        String foobar = "";
        if (number % 3 == 0) {
            foobar += "foo";
        }
        if (number % 5 == 0) {
            foobar += "bar";
        }
        System.out.println(foobar);
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        }
        if (n <= 1 || n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
