package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer pc1 = new Computer("Intel Pentium P5", 16, 2048, 2);
        System.out.println(pc1.toString());
        pc1.on();
        pc1.on();
        pc1.off();
        pc1.on();
        pc1.off();
        pc1.on();
    }
}
