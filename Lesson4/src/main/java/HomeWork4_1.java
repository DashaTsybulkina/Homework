import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4_1 {
    public static void main(String[] args) {
        System.out.println(summ(56, 2));
        printArray();
        printOddArray();
        System.out.println();
        System.out.println("Индекс максимального числа:" + getMaxValueIndexArray());
        System.out.println();
        printOddIndexOperationArray();
        SwapMaxValueNullIndexArray();
        FindSomeValuesArray(new int[]{2, 3, 4, 5, 2});
        transpose();
        calculateSumOfDiagonalElements();
        printMatrix();
        findMaxSum();
    }
//        Задачи:

//        1) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

    private static int inputInt() {
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
            if (isCorrect && ((n > Integer.MAX_VALUE) || (n < Integer.MIN_VALUE))) {
                System.out.println("Вы ввели число в неправильном диапазоне!");
                isCorrect = false;
            }
        } while (!isCorrect);
        return n;
    }


    public static int summ(int a, int b) {
        int result = 0;
        for (int i = 1; i <= b; i++) {
            result += a;
        }

        return result;
    }

//        2) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *

    public static void printArray() {
        char[][] arr = {{' ', ' ', ' ', '*'}, {' ', ' ', '*', '*'}, {' ', '*', '*', '*'}, {'*', '*', '*', '*'}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("   ");
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("   ");
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

//        3) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

    public static void printOddArray() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        int[] array = new int[count];
        for (int i = 1, b = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                array[b] = i;
                b++;
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

//        4) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    public static int getMaxValueIndexArray() {
        int[] mass = new int[12];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(16);
        }
        System.out.println("Массив:");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int maxValue = mass[0];
        int maxValueIndex = 0;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] >= maxValue) {
                maxValueIndex = i;
                maxValue = mass[i];
            }
        }
        return maxValueIndex;
    }
//        5) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

    public static void printOddIndexOperationArray() {
        int[] mass = new int[20];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(16);
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        for (int i = 1; i < mass.length; i += 2) {
            mass[i] = 0;
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }
//        6) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

    public static void SwapMaxValueNullIndexArray() {
        int[] mass = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int maxValue = mass[0];
        int maxValueIndex = 0;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] >= maxValue) {
                maxValueIndex = i;
                maxValue = mass[i];
            }
        }
        int temp = mass[0];
        mass[0] = mass[maxValueIndex];
        mass[maxValueIndex] = temp;
        System.out.println("\n");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }

    //        7) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

    public static void FindSomeValuesArray(int[] mass) {
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        Arrays.sort(mass);
        int count = 0;
        String values = "";
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] == mass[i - 1]) {
                count++;
                values += String.valueOf(mass[i]);
                values += ", ";
            }
        }
        values = values.substring(0, values.length() - 2);
        if (count == 0) {
            System.out.println("Массив не  имеет повторяющихся элементов");
        } else {
            System.out.println("Массив имеет повторяющиеся элементы " + values);
        }
    }

//        8) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7

    public static void transpose() {
        int n = inputInt();
        int[][] arr = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(51);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        int n = inputInt();
        int[][] arr = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(50);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("Сумма элементов на диагонали: " + sum);
    }

    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */

    public static void printMatrix() {
        int heigth = inputInt();
        int width = inputInt();
        int[][] arr = new int[heigth][width];
        Random rand = new Random();
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < width; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < width; j++) {
                if (arr[i][j] % 3 == 0) {
                    System.out.print("+ ");
                } else if (arr[i][j] % 7 == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    //    Доп задача!
//    Создать матрицу размера 10 на 10 и заполнить ее случайными целочислеными значениями (тип int) из диапазона от 0 до 10000.
//    Найти максимум среди сумм трех соседних элементов в строке. Для найденной тройки с максимальной суммой выведите значение суммы и индексы(i,j) первого элемента тройки.
//    Пример:
//            *Для простоты пример показан на одномерном массиве размера 10
//            [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254] Тройка с максимальной суммой:  [2789, 4, 8742]
//    Вывод в консоль:
//            11535 (0,5)
//            *Пояснение. Первое число - сумма тройки  [2789, 4, 8742]. Числа в скобках это 0 строка и 5 столбец - индекс первого элемента тройки, то есть индекс числа 2789.

    public static void findMaxSum() {
        int[][] arr = new int[10][10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(10000 + 1);
            }
        }
        int maxSum = 0;
        int indexI = 0;
        int indexJ = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                if (temp > maxSum) {
                    maxSum = temp;
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println(maxSum + " (" + indexI + "," + indexJ + ")");
    }

}