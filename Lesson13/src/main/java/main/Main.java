package main;

import model.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        readCatalog(new File("D://TMS"));
        GenericClass<String, Animal, Integer> genericClass = new GenericClass<>("String", new Animal(), 1);
        genericClass.printInformationClass();

        Integer[] numbersInteger = {112, 25, 65, 2, 23};
        MinMax<Integer> number = null;
        try {
            number = new MinMax<>(numbersInteger);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Максимальный элемент " + number.getMax());
        System.out.println("Минимальный элемент " + number.getMin());
        number.getInfo();

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(15, 16));
        System.out.println(calculator.divide(10, 12));
        System.out.println(calculator.multiply(54, 54));
        System.out.println(calculator.subtraction(58, 34));

        startShop();
    }

    public static void readCatalog(File directory) {
        if (directory.exists()) {
            for (File file : Objects.requireNonNull(directory.listFiles())) {
                if (file.isFile()) {
                    System.out.println(file + file.getName());
                } else {
                    readCatalog(file);
                }
            }
        } else {
            System.out.println("Директория не найдена");
        }
    }

    public static void startShop() {
        Shop shop = new Shop();
        int choice = 0;
        boolean isCorrect;
        while (choice != 5) {
            System.out.println("Меню:\n1.Вывод всех товаров\n2.Добавление товара\n3.Удаление товара\n4.Редактирование товара\n5.Выход");
            isCorrect = false;
            while (!isCorrect) {
                isCorrect = false;
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    isCorrect = true;
                } catch (Exception e) {
                    System.out.println("Введите число!Повторите ввод");
                    isCorrect = false;
                }
                if (!isCorrect && (choice > 5 || choice < 1)) {
                    System.out.println("Дапазон числа от 1 до 5! Повторите ввод");
                    isCorrect = false;
                }
            }
            switch (choice) {
                case 1 -> sort(shop);
                case 2 -> shop.addProduct(createProduct());
                case 3 -> shop.deleteProduct(getIdProduct());
                case 4 -> shop.editProduct(createProduct());
            }

        }
    }

    public static void sort(Shop shop) {
        System.out.println("Выберите метод сортировки:\n1.по цене(возрастание)\n2.по цене(убывание)\n3.по добавлению(сначала новые,потом старые)");
        boolean isCorrect = true;
        int choice = 0;
        while (isCorrect) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                isCorrect = false;
            } catch (Exception e) {
                System.out.println("Введите число!Повторите ввод");
                isCorrect = true;
            }
            if (!isCorrect && (choice > 3 || choice < 1)) {
                System.out.println("Дапазон числа от 1 до 5! Повторите ввод");
                isCorrect = true;
            }
        }
        ArrayList<Product> products = shop.getProducts();
        switch (choice) {
            case 1 -> {
                products.sort(Comparator.comparingInt(Product::getPrice));
                System.out.println(products);
            }
            case 2 -> {
                products.sort(Comparator.comparingInt(Product::getPrice).reversed());
                System.out.println(products);
            }
            case 3 -> {
                products.sort(Comparator.comparingLong(Product::getCreated).reversed());
                System.out.println(products);
            }
        }

    }

    public static Product createProduct() {
        boolean isCorrect = false;
        int id = 0;
        String name;
        int price = 0;

        System.out.println("Введите id ");
        while (!isCorrect) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("Введите число!Повторите ввод");
                isCorrect = false;
            }
        }

        isCorrect = false;
        System.out.println("Введите имя товара");
        name = scanner.nextLine();

        System.out.println("Введите цену товара");
        while (!isCorrect || price < 0) {
            try {
                price = Integer.parseInt(scanner.nextLine());
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("Введите число!Повторите ввод");
                isCorrect = false;
            }
        }
        return new Product(id, name, price, System.currentTimeMillis());
    }

    public static int getIdProduct() {
        int id = 0;
        System.out.println("Введите id товара");
        boolean isCorrect = false;
        while (!isCorrect) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("Введите число!Повторите ввод");
                isCorrect = false;
            }
        }
        return id;
    }
}
