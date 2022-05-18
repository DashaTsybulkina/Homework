package by.tms.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    int ram;
    double hardDrive;
    int cycles;
    boolean turnedOn;
    boolean burned;

    public Computer(String processor, int ram, double hardDrive, int cycles) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.cycles = cycles;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Процессор: " + processor +
                ",  " + ram + " Гб оперативной памяти" +
                "Жесткий диск на " + hardDrive + " Гб" +
                "Оставшийся ресурс полных циклов работы: " + cycles +
                '}';
    }

    public void on() {
        if (!burned) {
            if (turnedOn) {
                System.out.println("Компьютер уже включен.");
            } else {
                System.out.println("Включение...");
                if (cycles > 0 && activation()) {
                    turnedOn = true;
                    System.out.println("Компьютер включен.");
                } else {
                    System.out.println("Компьютер загорелся и сгорел!");
                    burned = true;
                }
            }
        } else {
            System.out.println("Компьютер сгорел!");
        }
    }

    public boolean activation() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int rightChoice = random.nextInt(2);
        int choice = 0;
        do {
            System.out.println("Внимание! Введите 0 или 1");
            if (scan.hasNextInt()) {
                choice = scan.nextInt();
            } else {
                scan.next();
            }
        } while (choice < 0 || choice > 1);
        return choice == rightChoice;
    }

    public void off() {
        if (turnedOn) {
            System.out.println("Выключение...");
            turnedOn = false;
            System.out.println("Компьютер выключен.");
            System.out.println("Осталось " + --cycles + " циклов работы");
        }
    }
}

