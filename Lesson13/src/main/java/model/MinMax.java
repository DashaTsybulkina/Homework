package model;

import java.util.Arrays;

public class MinMax<T extends Number> {
    private final T[] arrayOfNumbers;

    public MinMax(T[] array) throws Exception {
        if (array != null && array.length > 0) {
            this.arrayOfNumbers = array;
        } else {
            System.out.println("Массив не может быть пустым");
            throw new Exception();
        }
    }

    private void sort() {
        Arrays.sort(arrayOfNumbers);
    }

    public T getMax() {
        sort();
        return arrayOfNumbers[arrayOfNumbers.length - 1];
    }

    public T getMin() {
        sort();
        return arrayOfNumbers[0];
    }

    public void getInfo() {
        for (T arrayOfNumber : arrayOfNumbers) {
            System.out.println("Элемент " + arrayOfNumber + " типа " + arrayOfNumbers.getClass().getName());
        }
    }
}
